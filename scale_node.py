#!/usr/bin/python

#--------------------------------------------------------------------------#
# Program Name       : scale_cluster.py
# Version            : 1.0
# Description        : This script is used to add new nodes to Cloudera Manager	
# Parameters         :  Mentioned below. You can get the list of param using -h with the program
#
# Input Files        : template file.
# Output Files       : final_template.json
# Calling Modules    : None
# Called Modules     : None
# Dependecies        : None
# Changes Required   : None.
# Author             : Sudhanshu Sharma
# Written Date       : 07-11-2017
#--------------------------------------------------------------------------#


import json,sys,os,socket,ConfigParser,logging,re,moduleUtilities
import os.path	

from optparse import OptionParser
from cm_api.api_client import ApiResource
from cm_api.endpoints.types import ApiClusterTemplate
from cm_api.endpoints.cms import ClouderaManager
from cm_api.endpoints.types import ApiProductVersion
from cm_api.endpoints.services import ApiService
from time import sleep


HOST_CLUSTER=[]
HOST_MASTER=[]
HOST_DATA=[]
HOST_EDGE=[]

parser = OptionParser()

parser.add_option("-f", "--cm_config", dest="cm_config", action="store",
                  help="Filename that stores CM configuration in JSON format on Hadoop cluster Install", metavar="FILE")
parser.add_option("-s", "--host_file", dest="host_file", action="store",
                  help="Filename that stores CM configuration in JSON format on Hadoop cluster Install", metavar="FILE")
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
parser.add_option("-l", "--license_type", dest="license_type", action="store",
                  help="Choose license type  default:basic")
parser.add_option("-d", "--data_nodes", dest="data_nodes", action="store",
                  help="Cluster Data Node list")
parser.add_option("-e", "--edge_nodes", dest="edge_nodes", action="store",
                  help="Cluster Edge Node list")
parser.add_option("-q", "--host_pass", dest="host_pass", action="store",
                  help="CDH Host password")
parser.add_option("-m", "--mgmt_nodes", dest="mgmt_nodes", action="store",
                                        help="Cluster Mgmt Node list")
parser.add_option("-b", "--base_url", dest="base_url", action="store",
                                        help="Cloudera Repository base url")
parser.add_option("-t", "--cluster-type", dest="cluster_type", action="store",
                                        help="Cloud service provider name")


(options, args) = parser.parse_args()


CONFIG = ConfigParser.ConfigParser()
#CONFIG.read("../conf/config.ini")

# Instantiate utils
mutil=moduleUtilities.utils()


# Loading Cloudera Manager config
CM_HOST=mutil.return_host(''.join(mutil.opts_hosts_parse(options.cm_host )),cluster_type)
ADMIN_USER=str(options.cm_user )
ADMIN_PASS=str(options.cm_pass )
CM_API_VERSION = int(options.cm_api_version)
DB_PASS_SUFFIX = str(options.mysql_db_pass_suffix)
CM_PORT = int(options.cm_port)
CM_VERSION=options.cm_version
BASE_URL=str(options.base_url)
CM_CONFIG_FILE=options.cm_config
CM_CONFIG=''


# Loading Cluster config
CLUSTER_NM=str(options.cluster_nm )
CDH_VERSION=str(options.cdh_version)
CDH_PARCEL_VERSION=CDH_VERSION.split('-')[0]
HOST_FILE = str(options.host_file )
HOST_USER = str(options.host_user)
HOST_PASS = str(options.host_pass )
LICENSE_TYPE = int(options.license_type or  "1")
LOG_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+'/log/scale_cluster_exechistory_'+str(os.getpid())+'.log';
OUTPUT_TEMPLATE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/output/final_template_1.json";
CLUSTER_HOSTS = []


# Adding cloudera parcel URL
api = ApiResource(CM_HOST, CM_PORT , ADMIN_USER, ADMIN_PASS, version=CM_API_VERSION )
api.get_cloudera_manager().update_config({"REMOTE_PARCEL_REPO_URLS": BASE_URL + "/cdh5/parcels/" + CDH_PARCEL_VERSION + "/"})


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



if (LICENSE_TYPE == 1): TEMPLATE_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/basic_edition_template.json"
#elif (LICENSE_TYPE == 2): TEMPLATE_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/data_engineering_edition_template.json"
elif (LICENSE_TYPE == 3): TEMPLATE_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/operational_edition_template.json"
#elif (LICENSE_TYPE == 4): TEMPLATE_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/analytic_database_edition_template.json"
elif (LICENSE_TYPE == 5): TEMPLATE_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/enterprise_hub_edition_template.json"
else: TEMPLATE_FILE = ''; logger('error',"License error| Select correct license [ 1 - 5 ]"); exit;

logger('info',"License type: "+str(LICENSE_TYPE));
logger('info',"CDH_VERSION: " + str(CDH_VERSION) );
logger('info',"CDH_PARCEL_VERSION: "+str(CDH_PARCEL_VERSION));
logger('info',"CLUSTER_NM: "+str(CLUSTER_NM));


# Creating CM Instance
try:
        resource = ApiResource(CM_HOST,CM_PORT,username=ADMIN_USER, password=ADMIN_PASS,version=CM_API_VERSION);
        logger('info',"Creating CM Instance:"+CM_HOST);
except Exception,err:
        logger('warn',"Unable to connect Cloudera Manager:"+CM_HOST);
        logger('error',err);


logger('info',"CM Hosts :"+str(resource.get_all_hosts()));

# Fetching hosts from Ansible host file

HOST_DICT = mutil.ansible_host_dict(logger,HOST_FILE)
HOST_DATA_IP = (mutil.opts_hosts_parse(options.data_nodes) or HOST_DICT['Data-Nodes'])
print HOST_DATA_IP;
HOST_DATA = map(lambda a:mutil.return_host(a,cluster_type),HOST_DATA_IP)


mgmt_nodes = []
if options.mgmt_nodes: mgmt_nodes = list(mutil.opts_hosts_parse(options.mgmt_nodes))

MGMT_1 = mutil.return_host(mgmt_nodes[0] or HOST_DICT['Mgmt-01'][0],cluster_type)
MGMT_2 = mutil.return_host(mgmt_nodes[1] or HOST_DICT['Mgmt-02'][0],cluster_type)
MGMT_3 = mutil.return_host(mgmt_nodes[2] or HOST_DICT['Mgmt-03'][0],cluster_type)

# with open("/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/sample_template.json","rb") as data_file:
print TEMPLATE_FILE
with open(TEMPLATE_FILE,"rb") as data_file:
   data = json.load(data_file)

data["instantiator"]["clusterName"]= CLUSTER_NM
logger('info',"Added clusterName :"+str(CLUSTER_NM));
data["cdhVersion"]= CDH_VERSION
logger('info',"Added version :"+str(CDH_VERSION));
data["cmVersion"]= CM_VERSION
data["displayName"]=  CLUSTER_NM
logger('info',"Added version :"+str(CLUSTER_NM));



data["instantiator"]["hosts"][0]["hostName"]= MGMT_1
data["instantiator"]["hosts"][0]["hostTemplateRefName"]="MSTR-1"
logger('info',"Added Master Node: "+str(MGMT_1)+" MSTR-1");
data["instantiator"]["hosts"][1]["hostName"] = MGMT_2
data["instantiator"]["hosts"][1]["hostTemplateRefName"]="MSTR-2"
logger('info',"Added Master Node:"+str(MGMT_2)+" MSTR-2");
data["instantiator"]["hosts"][2]["hostName"] = MGMT_3
data["instantiator"]["hosts"][2]["hostTemplateRefName"]="MSTR-3"
logger('info',"Added Master Node:"+str(MGMT_3)+" MSTR-3");
data["products"][0]["version"] = CDH_VERSION

# No. of data Nodes
i=3
# i=2
# d=1
d=4
e=0
edge_element=4
data_element=3

# Enable EDGE NODES
if 'Edge-Nodes' in HOST_DICT.keys():
        HOST_EDGE = (options.edge_nodes or HOST_DICT['Edge-Nodes'])
        if len(HOST_EDGE) != 0:
                for edge_host in HOST_EDGE:
                        edge_host=mutil.return_host(edge_host,cluster_type)
                        print edge_host+" edge",i
                        if edge_host:
                                logger('info',"Added Edge Node"+str(i)+" :"+str(edge_host)+" EDGE-NODE-1");
                                data["instantiator"]["hosts"].insert(i,{u'hostName': 'EDGE_PLACEHOLDER', u'hostTemplateRefName': 'EDGE-NODE-1'})
                                data["instantiator"]["hosts"][i]["hostName"] = edge_host
                                data["instantiator"]["hosts"][i]["hostTemplateRefName"] = "EDGE-NODE-1"
                                print data["instantiator"]["hosts"][i]
                                data["hostTemplates"][edge_element]["cardinality"] = e
                                i=i+1
                                e=e+1

for data_host in HOST_DATA:
   print data_host+" data",i
   if data_host:
        logger('info',"Added Data Node"+str(i)+" :"+str(data_host)+" DATA-NODE-1")
        data["instantiator"]["hosts"].insert(i,{u'hostName': 'DATA_PLACEHOLDER', u'hostTemplateRefName': 'DATA-NODE-1'});
        data["instantiator"]["hosts"][i]["hostName"] = data_host
        data["instantiator"]["hosts"][i]["hostTemplateRefName"] = "DATA-NODE-1"
        data["hostTemplates"][data_element]["cardinality"] = d
        i=i+1
        d=d+1



name=[]
value=[]
with open("/".join(os.path.realpath( __file__ ).split("/")[:-2])+"/templates/configuration.values","rb") as config_file:
        for line in config_file:
                (json_path,name,value)=line.strip("\n").split('|');
                logger('info',"Adding variables: \n"+"JsonPath: "+json_path+"\n{ name:"+name+",\n value:"+value+" }\n");
                if json_path.split(".")[0] == "instantiator":
                        if 'host' in name:
                                data[json_path.split(".")[0]][json_path.split(".")[1]].append({"name":name, "value":CM_HOST})
                        else: data[json_path.split(".")[0]][json_path.split(".")[1]].append({"name":name, "value":value})
                elif json_path.split(".")[0] == "service":
                        data[json_path.split(".")[0]][json_path.split(".")[1]].append({"name":name, "value":value})
with open (OUTPUT_TEMPLATE,"wb+") as file1:
        json.dump(data,file1,indent=4, sort_keys=True)


CM_CONFIG_FILE = "/".join(os.path.realpath( __file__ ).split("/")[:-2])+str(CM_CONFIG_FILE)
if os.path.isfile(CM_CONFIG_FILE):
        with open(CM_CONFIG_FILE,'rb') as update_cm_config:
                CM_CONFIG = update_cm_config.read().strip()


def start_service(serviceType):
        for service in resource.get_cluster(CLUSTER_NM).get_all_services():
                if(service.type == serviceType): cmd =service.restart(); print cmd.active


def check_service_start(logger):
        for service in resource.get_cluster(CLUSTER_NM).get_all_services():
                if(service.type == 'OOZIE'):
                        print 'STAGE 6. Upgrade Oozie Service'
                        deploy_CMS.oozie_setup(logger,service)
                elif(service.type == 'HIVE'):
                        print 'STAGE 6. Upgrade Hive Service'
                        deploy_CMS.hive_setup(logger,service)

                if(service.serviceState == 'STOPPED'):
                        cmd =service.restart();
                        print('info','Starting Service:'+service.name,cmd.active)
                        logger('info','Starting Service:'+service.name)
def cm_install_hosts(logger,cms,HOST_USER,CLUSTER_HOSTS,HOST_PASS):
        try:
                logger('info',"Running Host Install command on Cloudera Manager")
                print type(CLUSTER_HOSTS)
                cmd_status = deploy_CMS.install_hosts_pass(cms,HOST_USER,CLUSTER_HOSTS,HOST_PASS,"")
                logger('info',"Installing Cloudera Manager Agents on  " + ' '.join(CLUSTER_HOSTS) )
                logger('info',"This step will take some time")
        except:
                logger('warn',"Host Install command failed on Cloudera Manager")
                logger('warn',"Hosts already added in CM")


def main():
        try:
                print '###############################\n\n'
                print 'STAGE 0. Services Prerequisite'
#               api_prerequisite()
                template = ApiClusterTemplate(resource).from_json_dict(data, resource)
                cms = ClouderaManager(resource)
                print 'STAGE 1. Installing Hosts'
                # Union of all Hosts
                CLUSTER_HOSTS = list(set(MGMT_1.split()) | set(MGMT_2.split()) | set(MGMT_3.split()) | set(HOST_DATA))
                print CLUSTER_HOSTS
                logger('info','Cluster Hosts part of this install' )
                logger('info','Adding hosts to Cloudera Manager')
                cm_install_hosts(logger,cms,HOST_USER,CLUSTER_HOSTS,HOST_PASS)
				
                print 'STAGE 2. CM API importing cluster template'
                logger('info','CM API importing cluster template' + OUTPUT_TEMPLATE )
                command = cms.import_cluster_template(template)
                command = command.wait()

                print "Active: %s. Success: %s" % (command.active, command.success)
                print "Cluster installation triggered !!!"
                logger('info',"Cluster template " + CLUSTER_NM + " import finished !!!");
        except Exception,err:
                logger('error',"Getting below exceptions, unable to install cluster " + CLUSTER_NM);
                logger('error',str(err));
                print "Failed to import cluster\n\n";
                print "Getting exceptions... check log file: "+LOG_FILE;
                sys.exit(1)
if __name__ == "__main__":
        main()