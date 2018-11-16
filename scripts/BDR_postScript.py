######################################################
#### BDR Post-Script for Panera DEVQA ################
#### Author: SUDHANSHU SHARMA(AB57898) ###############
######################################################

import json,requests
import kerberos
from requests_kerberos import HTTPKerberosAuth, REQUIRED
from pandas.io.json import json_normalize
import pandas as pd
from urllib2 import Request, urlopen
import ConfigParser
import smtplib
from email.mime.text import MIMEText
from email.header import Header
import operator,time,MySQLdb


config = ConfigParser.ConfigParser()
# Added to keep ConfingParser from lowercasing.
config.optionxform = str
config.read('config/client_config.ini')

def config_grabber(section):
    temp = dict()
    for i in config.options(section):
        temp.update({i:config.get(section,i)})
    return temp


def sendmail(message,subject_cat):
        conf = config_grabber("mail")
        sender = conf['sender']
        #receiver = conf['receiver'].split(",")
        receiver = conf['receiver']
        subject = subject_cat+'|'+conf['subject']
        smtpserver = conf['smtpserver']
        msg = MIMEText(message, 'html', 'utf-8')
        msg['Subject'] = Header(subject, 'UTF-8')
        msg['From'] = sender
        msg['To'] = receiver
        smtp = smtplib.SMTP(smtpserver)
        smtp.sendmail(sender,[receiver], msg.as_string())
        smtp.quit()

	
def prepare_Alter(password):
	strBuffer='## BDR Job has been completed, execute below ALTER queries on Hive: ##\n\n'
	db_obj = MySQLdb.connect(host='ny1dlabmgmt194.bdaas.centurylink.com',user='hive',passwd=password,db='hive')
	c_obj = db_obj.cursor()
	c_obj.execute("SELECT  d.NAME, t.TBL_NAME,s.LOCATION,sp.PARAM_KEY, sp.PARAM_VALUE FROM hive.TBLS t  JOIN hive.DBS d ON t.DB_ID = d.DB_ID  JOIN hive.SDS s ON t.SD_ID = s.SD_ID   JOIN hive.SERDE_PARAMS sp ON sp.SERDE_ID = s.SERDE_ID  WHERE d.NAME='prod_edw' and sp.PARAM_KEY = 'path'")
	for dbName,tblName,location,paramKey,ParamValue in c_obj.fetchall():
		strBuffer+="ALTER TABLE "+dbName+"."+tblName+" SET SERDEPROPERTIES ('"+paramKey+"='"+ParamValue+"');\n"
	with open("commands.txt",'wb+') as file:
		file.write(strBuffer)
	return strBuffer


def validations_BDRJobHistory():
        endpoint=config_grabber("root")["endpoint"]
        principal=config_grabber("root")["principal"]
        __, krb_context = kerberos.authGSSClientInit(principal)
        kerberos.authGSSClientStep(krb_context, "")
        negotiate_details = kerberos.authGSSClientResponse(krb_context)
        headers = {"Authorization": "Negotiate " + negotiate_details}
        res = requests.get(endpoint, headers=headers, verify=False)
        data = json.loads(res.text)
		latestJobHistory=data['items'][0]['history'][0]
		if latestJobHistory['active'] == 'False':
		   if latestJobHistory['success'] == 'True' and str(latestJobHistory['endTime']) > utc_now.strftime("%Y-%m-%dT%H:%M:%S.%f"):
			return True
		   else:
			return False
		else:
			time.sleep(120)
			validations_BDRJobHistory(service)

def main():
	if validations_BDRJobHistory() == True:
		message = prepare_Alter(sys.Argv[1])
		sendmail(message,"Action Required")
	else: 
		sendmail("BDR Post-Script Failed. Kindly check","Error")
main()
