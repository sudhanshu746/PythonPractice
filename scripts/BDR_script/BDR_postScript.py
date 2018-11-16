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
import operator


config = ConfigParser.ConfigParser()
# Added to keep ConfingParser from lowercasing.
config.optionxform = str
config.read('config/client_config.ini')

def config_grabber(section):
    temp = dict()
    for i in config.options(section):
        temp.update({i:config.get(section,i)})
    return temp


def sendmail(service,message,subject_cat):
        conf = config_grabber(service+"-mail")
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



def apply_operator(a, op, b):
    method = '__%s__' % op
    return getattr(str(a), method)(str(b))

def thresholdCheck(service,alert_msg,thresholdTypes=[]):
        endpoint=config_grabber(service+"-svc-config")["endpoint"]
        principal=config_grabber(service+"-svc-config")["principal"]
        __, krb_context = kerberos.authGSSClientInit(principal)
        kerberos.authGSSClientStep(krb_context, "")
        negotiate_details = kerberos.authGSSClientResponse(krb_context)
        headers = {"Authorization": "Negotiate " + negotiate_details}
        res = requests.get(endpoint, headers=headers, verify=False)
        data = json.loads(res.text)
        df=pd.DataFrame.from_records(data['beans'])
        for thresholdType in thresholdTypes:
                for key in config_grabber(service)["attributes"].split(","):
                        if key in config_grabber(thresholdType).keys():
                                value=config_grabber(thresholdType)[key]
                                        #if(apply_operator(value,thresholdType,df.loc[0][key])):
                                if(apply_operator(value,thresholdType,str(df.loc[0][key]).strip())):
                                        alert_msg += '<tr class="p3"> <td> '+key+' </td><td> '+value+' </td><td> '+str(df.loc[0][key])+' </td></tr>'
                                        #alert_msg += key+" value increased to "+str(df.loc[0][key])+".Imigiate action required\n"
        return alert_msg

def main():
                with open('config/header.html') as header:
                        alert_header=header.read();
                with open('config/footer.html') as footer:
                        alert_footer=footer.read();
                alert_body='';
                thresholdType=config_grabber('root')['thresholdTypes'].split(",")
                for service in config_grabber('root')['service'].split(","):
                        alert_body+=thresholdCheck(service,'',thresholdType)
                        print(alert_body)
                        if ( alert_body != ''):
                                sendmail(service,alert_header+alert_body+alert_footer,'P1: NameNode Alert')

main()
