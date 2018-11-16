#!/usr/bin/python

## ** imports *******************************

import sys
import pprint
import argparse
from datetime import datetime, timedelta
from cm_api.api_client import ApiResource

## ** Settings ******************************
parser = argparse.ArgumentParser(description="Cancelling Impala Queries",
                                 formatter_class=argparse.ArgumentDefaultsHelpFormatter)
parser.add_argument('host', metavar='HOST', type=str, help="The Cloudera Manager host")
parser.add_argument('cluster', metavar='CLUSTER', type=str,
                    help="The name of the cluster")
parser.add_argument('--port', metavar='port', type=int, default=7180,
                    help="Cloudera Manager's port.")
parser.add_argument('--username', metavar='USERNAME', type=str, default='admin',
                    help="The username to log into Cloudera Manager with.")
parser.add_argument('--password', metavar='PASSWORD', type=str, default='admin',
                    help="The password to log into Cloudera Manager with.")
parser.add_argument('--use-tls', action='store_true',
                    help="Whether to use TLS to connect to Cloudera Manager.")
settings = parser.parse_args()

## *****************************************

fmt = '%Y-%m-%d %H:%M:%S %Z'

pp = pprint.PrettyPrinter(indent=4)


impala_service = None

## Connect to CM
print "------------------------------------------------------------------------------------------------------"
print "\nConnecting to Cloudera Manager at " + settings.host + ":" + str(settings.port)
api = ApiResource(settings.host, settings.port, settings.username,settings.password, settings.use_tls)

## Get the Cluster
cluster = api.get_cluster(settings.cluster)

## Get the IMPALA service
service_list = cluster.get_all_services()

for service in service_list:
  if service.type == "IMPALA":
    impala_service = service
    print "Located Impala Service: " + service.name
    break

if impala_service is None:
  print "Error: Could not locate Impala Service"
  quit(1)

# configure this to use a window of one day
now = datetime.now()
start = now - timedelta(days=1)

print "Looking for Impala queries executed in pool \"root.birstqa\" running for more than 20 minutes"

filterStr = 'pool=root.birstqa AND query_duration>= 20m AND query_status=ok AND query_state!=FINISHED'


impala_query_response = impala_service.get_impala_queries(start_time=start, end_time=now, filter_str=filterStr, limit=100)

queries = impala_query_response.queries

length = len(queries)

print "TIMESTAMP of running this script : " + str(now)

if length == 0:
  print "No Birst query can be seen running for more than 20 minutes"

for i in range (0, length):
  query = queries[i]
  print '-------------------------------------'
  print 'Cancelling below Impala Query'
  #print "queryState : " + query.queryState
  print "queryId: " + query.queryId
  print "user: " + query.user
  print "pool: " + query.attributes['pool']
  duration = timedelta(milliseconds=query.durationMillis)
  print "duration: " + str(duration)
  #print "startTime: " + query.startTime.strftime(fmt)
  #print "SQL: " + query.statement
  #pp.pprint(query.attributes)
  impala_service.cancel_impala_query(query.queryId)
  print 'Cancelled query'

print '-------------------------------------'
print "Done"
print "------------------------------------------------------------------------------------------------------"
