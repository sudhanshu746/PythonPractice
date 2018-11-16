import json
import sys
import os
import socket
import ConfigParser
import logging
import os.path
import re
import moduleUtilities

from optparse import OptionParser
from cm_api.api_client import ApiResource
from cm_api.endpoints.types import ApiClusterTemplate
from cm_api.endpoints.cms import ClouderaManager
from cm_api.endpoints.types import ApiProductVersion
from cm_api.endpoints.services import ApiService
from cm_api.endpoints.host_templates import ApiHostTemplate 
from time import sleep

def logger(logType,msg):
	'''
Logger v1
logType : [debug|info|warn|error|critical]
msg : Log message
:return:
	'''
	logging.basicConfig(filename=LOG_FILE,level=logging.DEBUG,format='%(asctime)s.%(msecs)d %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt="%Y-%m-%d %H:%M:%S")
	
	if logType == 'debug': logging.debug(msg)
	elif logType == 'info': logging.info(msg) 
	elif logType == 'warn': logging.warning(msg) 
	elif logType == 'error': logging.error(msg) 
	elif logType == 'critical': logging.critical(msg) 
	return True;

'''
parser = OptionParser()


parser.add_option("-i", "--cm_host", dest="cm_host", action="store",
                  help="Host name or IP address of the Cloudera Manager Host")
parser.add_option("-c", "--cluster_nm", dest="cluster_nm", action="store",
                  help="Name of the CDH Cluster")
parser.add_option("-v", "--cdh_version", dest="cdh_version", action="store",
                  help="CDH version to be installed")
parser.add_option("-g", "--cm_version", dest="cm_version", action="store",
                  help="CM version to be installed")
parser.add_option("-u", "--cm_user", dest="cm_user", action="store",
                  help="Cloudera manager user")
parser.add_option("-p", "--cm_pass", dest="cm_pass", action="store",
                  help="Cloudera manager user")
parser.add_option("-o", "--cm_port", dest="cm_port", action="store",
                  help="Cloudera manager port")
parser.add_option("-a", "--cm_api_version", dest="cm_api_version", action="store",
                  help="Cloudera manager API version")
parser.add_option("-x", "--mysql_db_pass_suffix", dest="mysql_db_pass_suffix", action="store",
                  help="Mysql DB user pass suffix")
parser.add_option("-y", "--host_user", dest="host_user", action="store",
                  help="OS host user")
parser.add_option("-q", "--host_pass", dest="host_pass", action="store",
                  help="CDH Host password")
parser.add_option("-b", "--base_url", dest="base_url", action="store",
                                        help="Cloudera Repository base url")
parser.add_option("-t", "--cluster-type", dest="cluster_type", action="store",
                                        help="Cloud service provider name")


(options, args) = parser.parse_args()


CONFIG = ConfigParser.ConfigParser()
'''

CM_HOST="va1cog3mgmt532.bdaas.centurylink.com"
CM_PORT=7180
ADMIN_USER='admin'
ADMIN_PASS='admin'
CM_API_VERSION=14
BASE_URL='http://archive.cloudera.com'
CDH_PARCEL_VERSION='5.9.1'
HOST='va1cog3nwdata01.bdaas.centurylink.com'
CLUSTER_NM='BDAAS_CENTRIFY'
LOG_FILE='/tmp/log.out'
HOST_TEMPLATE="DataNode_"+CLUSTER_NM
DEFINED_SERVICES = ["impala-IMPALAD","hbase-GATEWAY-BASE","yarn-NODEMANAGER","hdfs-DATANODE","hive-GATEWAY-BASE","spark_on_yarn-GATEWAY-BASE","yarn-GATEWAY-1","hdfs-GATEWAY-1"]

try:
	resource = ApiResource(CM_HOST,CM_PORT,username=ADMIN_USER, password=ADMIN_PASS,version=CM_API_VERSION);
	resource.get_cloudera_manager().update_config({"REMOTE_PARCEL_REPO_URLS": BASE_URL + "/cdh5/parcels/" + CDH_PARCEL_VERSION + "/"})
	cluster = resource.get_cluster(CLUSTER_NM)
	cm  = resource.get_cloudera_manager()
	logger('info',"Creating CM Instance:"+CM_HOST);
except Exception,err:
	logger('warn',"Unable to connect Cloudera Manager:"+CM_HOST);
	logger('error',err);


custom_template={}
custom_template["name"]=HOST_TEMPLATE
custom_template["clusterRef"]=CLUSTER_NM
custom_template["roleConfigGroupRefs"]=[]




cluster_services = cluster.get_all_services()
for service in DEFINED_SERVICES:
	servt={}
	srv = (service.split('-'))[0]
	if srv in [s.name for s in cluster_services]:
		servt["roleConfigGroupName"]=str(service)
		custom_template["roleConfigGroupRefs"].append(servt)

data = json.dumps(custom_template,ensure_ascii=False).encode('utf8')
template = ApiHostTemplate(resource).from_json_dict(data,resource)
'''
try:
	cm.host_install(host_user,[HOST],password=host_pass,cm_repo_url=cm_repo_url,unlimited_jce=True).wait()
except Exception,err:
	logger('warn',"host_install Failure"+HOST);
	logger('error',err);
'''
try:
	template.apply_host_template([HOST],start_roles=True).wait()
except Exception,err:
	logger('warn',"Template issue, unable to apply Host template"+HOST);
	logger('error',err);


