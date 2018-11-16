#===============================================================================
#
#         FILE:  panAuditUtils.py
#
#  DESCRIPTION:  Python module for logging auditing information to an HBase table.
#
#                Contains class panAudit
#
#                USAGE:
#
#                 from pyspark import SparkContext, SparkConf
#                 import panAuditUtils
#                 import sys
#                 import traceback
#
#                 def mapFunc (val):
#                     return val*10
#
#                 conf = SparkConf().setAppName("Spark Hello")
#                 sc = SparkContext(conf=conf)
#
#                 # Script level audit message.  From spark make sure to pass the Application ID
#                 scriptAud = panAuditUtils.panAudit( "Main", sc.applicationId)
#                 try:
#
#                     # Audit message for a unit of work.  Notice that this references the audit ID of the script
#                     # level audit message.
#                     rddAud = panAuditUtils.panAudit( "Start of RDD Work", sc.applicationId, scriptAud.get_audit_id())
#                     theRDD = sc.parallelize([1, 2, 3, 4, 5, 6, 7, 8, 9]).map(mapFunc)
#
#                     rddResults = theRDD.collect()
#
#                     # Log that we successfully completed the unit of work.
#                     rddAud.update("SUCCESS", "Processed %d records" % len(rddResults))
#
#                     # Deliberately throw an exception
#                     myVar = 17 / 0
#
#                     # This is where a normal successful completion gets logged.
#                     scriptAud.update("SUCCESS")
#
#                 except:
#
#                     # Log the exception to the database
#                     excpMsg = traceback.format_exception(sys.exc_info()[0], sys.exc_info()[1], sys.exc_info()[2])
#                     scriptAud.update("ERROR", excpMsg)
#
#
#===============================================================================
#  Modifications
#===============================================================================
#
# Date         : 9/26/2017
# Modified By  : Casey Catalano
# Modification : Original Version
#===============================================================================

import panConfig
import uuid
import datetime
import inspect


import sys
import traceback

#sys.path.insert(0, "/home/pan_dev/HBaseThrift")


from thrift.transport import TSocket
from thrift.protocol import TBinaryProtocol
from thrift.transport import TTransport
from HBaseThrift.hbase import Hbase
from HBaseThrift.hbase.ttypes import Mutation
import sasl
import kerberos




"""
Utility to log audit progress to the audit_history table in HBase.


"""



class panAudit:

    def __init__(self, desc, app_id = 'NonSpark', parent_audit_id = None, envVal = None, hbaseThriftServers = None, audit_id = None):

        """
        Populate all values and write an initial record to hbase table audit_history.

        The status and status_msg can be updated with the update call.

        Supply envVal and hbaseThriftServers if this will not be called from the Edge node as the panera.ini
        file is only available on the Edge Node.
        """

        # If needed the the value of environment and a comma seperated list of HBase Thrift servers string from panConfig
        theConfig = panConfig.panConfig()
        if envVal:
            self.envVal = envVal
        else:
            self.envVal = theConfig.get('envVal')
        if hbaseThriftServers:
            self.hbaseThriftServers = hbaseThriftServers
        else:
            self.hbaseThriftServers = theConfig.get('hbaseThriftServers').split(',')

        if not audit_id:

           # Assign this audit record a unique ID.  Log the parent audit_id.
           self.audit_id = str(uuid.uuid4())
           self.parent_audit_id = parent_audit_id

           # Set the start and end timestamps to the current time
           tsNow = datetime.datetime.now()
           self.start_dttm = str(tsNow)
           self.end_dttm = str(tsNow)

           # Use the inspect module to get the name of the current script and line number of the caller from
           # the call stack.
           self.script_name = inspect.stack()[1][1]
           self.script_line = str(inspect.stack()[1][2])

           # Initial status will always be INPROG.  A status_msg has to be supplied by a call to update.
           self.status = 'INPROG'
           self.status_msg = None

           # Description of what we are logging.
           self.desc = desc

           # A spark job will have an APP ID.  Yarn aggregated logs can be helpful in troubleshooting.
           self.app_id = app_id


           self.writeHbase()

        else:


           conn = self.connect()
           tableName = self.envVal + ":audit_history"
           theResults = conn['client'].getRow (tableName, audit_id, {})
           conn['transport'].close()


           self.audit_id = audit_id
           self.start_dttm = theResults[0].columns['a:sd'].value
           self.end_dttm = theResults[0].columns['a:ed'].value
           self.script_name = theResults[0].columns['a:sn'].value
           self.script_line = theResults[0].columns['a:sl'].value
           self.status = theResults[0].columns['a:s'].value

           try:
               self.parent_audit_id = theResults[0].columns['a:pai'].value
           except:
               self.parent_audit_id = None
           if parent_audit_id:
               self.parent_audit_id = parent_audit_id

           try:
               self.status_msg =  theResults[0].columns['a:sm'].value
           except:
               self.status_msg =  None
           self.desc =  theResults[0].columns['a:d'].value
           self.app_id = theResults[0].columns['a:ai'].value


    def update (self, status, status_msg = None):

        """
        Update the status and status_msg values and write them to hbase table audit_history
        """
        if status not in ['INPROG', 'SUCCESS', 'WARN', 'ERROR']:
            raise ValueError ("Invalid status.  Valid values are INPROG, SUCCESS, WARN, ERROR")
        self.status = status

        # status_msg has to be a string to be written to HBase.  You can pass an exception if desired.
        self.status_msg = str(status_msg)

        # Update end_dttm timestamp.
        tsNow = datetime.datetime.now()
        self.end_dttm = str(tsNow)

        # Update the line number of the caller from the call stack.
        self.script_line = str(inspect.stack()[1][2])
        self.writeHbase()


    def __repr__(self):
        return str(self.__dict__)


    def connect(self):

        connectSuccess = False
        thriftIter = iter(self.hbaseThriftServers)
        try:

            while not connectSuccess:

                hbase_thrift_server_host = thriftIter.next()


                try:


                    hbase_thrift_server_port = 9090

                    socket = TSocket.TSocket(hbase_thrift_server_host, hbase_thrift_server_port)
                    transport = TTransport.TSaslClientTransport(socket, hbase_thrift_server_host, 'hbase')
                    #transport = TTransport.TBufferedTransport(socket)
                    protocol = TBinaryProtocol.TBinaryProtocol(transport)

                    client = Hbase.Client(protocol)
                    transport.open()
                    connectSuccess = True
                except:
                    print "Caught Exception processing %s" % hbase_thrift_server_host
                    excpMsg = traceback.format_exception(sys.exc_info()[0], sys.exc_info()[1], sys.exc_info()[2])
                    print excpMsg

        except:

            print "Caught Exception on final thrift host"
            raise

        return {'client' : client, 'transport' : transport }

    def writeHbase(self):

        """
        Write to hbase table audit_history
        """

        conn = self.connect()

        # Write to the audit_history table.
        tableName = self.envVal + ":audit_history"
        mutations = []
        mutations.append (Mutation(column='a:sd', value=self.start_dttm))
        mutations.append (Mutation(column='a:ed', value=self.end_dttm))
        mutations.append (Mutation(column='a:sn', value=self.script_name))
        mutations.append (Mutation(column='a:sl', value=self.script_line))
        mutations.append (Mutation(column='a:s', value=self.status))
        mutations.append (Mutation(column='a:d', value=self.desc))
        mutations.append (Mutation(column='a:ai', value=self.app_id))

        if self.status_msg:
            mutations.append (Mutation(column='a:sm', value=self.status_msg))
        if self.parent_audit_id:
            mutations.append (Mutation(column='a:pai', value=self.parent_audit_id))

        conn['client'].mutateRow(tableName, self.audit_id, mutations, None)
        conn['transport'].close()


    def get_audit_id(self):
        return self.audit_id

