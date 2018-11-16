import panConfig
import json


class hbaseUtils:

    def __init__ (self, zookeeper_quorum = None):
        self.zookeeper_quorum = zookeeper_quorum


    def bulk_read_from_hbase (self, sc, tableName):

#        conf = {"hbase.zookeeper.quorum": self.zookeeper_quorum, "hbase.mapreduce.inputtable": tableName}
        conf = {"hbase.zookeeper.quorum": "ny1dlabmgmt194.bdaas.centurylink.com,ny1dlabmgmt195.bdaas.centurylink.com,ny1dlabmgmt196.bdaas.centurylink.com", "hbase.zookeeper.property.clientPort":"2181", "zookeeper.znode.parent":"/hbase","zookeeper.znode.rootserver":"root-region-server","hadoop.security.authentication":"kerberos","hbase.security.authentication":"kerberos","hbase.rpc.protection":"authentication","hbase.security.authentication":"kerberos","hbase.master.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM","hbase.regionserver.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM","hbase.rest.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM", "hbase.thrift.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM", "hbase.mapreduce.inputtable": tableName}
        #conf = {"hbase.zookeeper.quorum": "ny1dlabmgmt194.bdaas.centurylink.com,ny1dlabmgmt195.bdaas.centurylink.com,ny1dlabmgmt196.bdaas.centurylink.com", "hbase.zookeeper.property.clientPort":"2181", "zookeeper.znode.parent":"/hbase","zookeeper.znode.rootserver":"root-region-server","hadoop.security.authentication":"kerberos","hbase.security.authentication":"kerberos","hbase.rpc.protection":"authentication","hbase.security.authentication":"kerberos","hbase.master.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM","hbase.regionserver.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM","hbase.rest.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM", "hbase.thrift.kerberos.principal" : "hbase/_HOST@BDAAS.CENTURYLINK.COM", "hbase.mapreduce.inputtable": "dev:mpn_input_incremental_cust_id"}

        keyConv = "org.apache.spark.examples.pythonconverters.ImmutableBytesWritableToStringConverter"
        valueConv = "org.apache.spark.examples.pythonconverters.HBaseResultToStringConverter"

        hbase_rdd = sc.newAPIHadoopRDD(
            "org.apache.hadoop.hbase.mapreduce.TableInputFormat",
            "org.apache.hadoop.hbase.io.ImmutableBytesWritable",
            "org.apache.hadoop.hbase.client.Result",
            keyConverter=keyConv,
            valueConverter=valueConv,
            conf=conf)
        return hbase_rdd.flatMapValues(lambda v: v.split("\n")).mapValues(json.loads)



    def bulk_save_to_hbase (self, insRDD, tableNames):

        # We want to process the RDD looking for all possible combinations of
        # table_name, column_family, and column.
        # This is where a function should start that will be called from foreachRDD

        # Persist the RDD, because we will have to make multiple passes at it.
        if len(tableNames) > 1:
            insRDD.persist()


        for tableName in tableNames:

            # Use filter to get just the rows that we want, then use map to setup the data the way that
            # saveAsNewAPIHadoopDataset wants to see it. (rowkey, [rowkey, columnFamily, columnName, columnValue
            hbaseRDD = insRDD.filter( lambda v: v[0] == tableName)\
                             .map(lambda v: (v[1], v[1:] ) )


            # Setup conf that tells saveAsNewAPIHadoopDataset about the hbase server, the table name and
            # the JVM classes to use for HBase.
            # Note:  There has to be a more maintainable way to get the zookeeper quorum from configuration rather
            # than hard-coding
            conf = {"hbase.zookeeper.quorum": self.zookeeper_quorum,
                    "hbase.mapred.outputtable": tableName,
                    "mapreduce.outputformat.class": "org.apache.hadoop.hbase.mapreduce.TableOutputFormat",
                    "mapreduce.job.output.key.class": "org.apache.hadoop.hbase.io.ImmutableBytesWritable",
                    "mapreduce.job.output.value.class": "org.apache.hadoop.io.Writable"}


            # JVM classes that convert the key and value from Strings to the types that HBase's Java API's expect
            # To get these to work spark-submit had to be called with
            #   --jars /opt/cloudera/parcels/CDH/jars/spark-examples-1.6.0-cdh5.9.3-hadoop2.6.0-cdh5.9.3.jar
            #
            # To be able to process multiple columns at once, a new valueConv class could be created that would
            # take 3c + 1 elements in a list, where c is the number of columns.
            #
            # We also may have issues with unicode coversions that were similar to what we had with happybase
            keyConv = "org.apache.spark.examples.pythonconverters.StringToImmutableBytesWritableConverter"
            valueConv = "org.apache.spark.examples.pythonconverters.StringListToPutConverter"




            # Make the HBase table updates.
            hbaseRDD.saveAsNewAPIHadoopDataset( conf=conf, keyConverter=keyConv, valueConverter=valueConv)

        # Free up the RDD that we persisted.
        if len(tableNames) > 1:
            insRDD.unpersist()


