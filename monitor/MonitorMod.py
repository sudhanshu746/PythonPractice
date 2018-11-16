#!~/.conda/envs/ssharma/bin/python
######################################################
#### Monitoring script for Hadoop Services ###########
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
from ast import literal_eval


config = ConfigParser.ConfigParser()
# Added to keep ConfingParser from lowercasing.
config.optionxform = str
config.read('config/monitorpar.conf')

def config_grabber(section):
    temp = dict()
    for i in config.options(section): temp.update({i:config.get(section,i)})
    return temp


def sendmail(service,message,subject_cat):
        conf = config_grabber(service+"-mail")
        sender = conf['sender']
        #receiver = conf['receiver'].split(",")
        receiver = conf['receiver']
        subject = subject_cat+'| '+conf['subject']
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
        sub = '';flag = 0
        for thresholdType in thresholdTypes:
                for key in literal_eval(config_grabber(service)[thresholdType]):
                        for prio in literal_eval(config_grabber('root')['priority']):
                                if (service+"|"+key) in config_grabber(prio).keys():
                                        value=config_grabber(prio)[service+"|"+key]
                                        new_val=df.loc[0][key]
                                        #if(apply_operator(value,thresholdType,df.loc[0][key]))
                                        if(thresholdType in ['ne','eq']):
                                                res = apply_operator(value,thresholdType,str(new_val).strip())
                                        elif(thresholdType == 'lt'): res = True if float(value) < float(new_val) else False;
                                        elif(thresholdType == 'gt'): res = True if float(new_val) > float(value) else False
                                        if(res):
                                                print(float(df.loc[0][key]),thresholdType,float(value))
                                                alert_msg += '<tr class="'+prio+'"> <td> '+key+' </td><td> '+value+' </td><td> '+str(df.loc[0][key])+' </td></tr>'
                                                if flag == 0: sub = "ALERT "+prio+": "+service+" ";flag=1
                                        else :alert_msg += '<tr> <td> '+key+' </td><td> '+value+' </td><td> '+str(df.loc[0][key])+' </td></tr>'
        return (sub,alert_msg)

def main():
                with open('config/header.html') as header:
                        alert_header=header.read();
                with open('config/footer.html') as footer:
                        alert_footer=footer.read();
                alert_body='';
                thresholdType=literal_eval(config_grabber('root')['thresholdTypes'])
                for service in literal_eval(config_grabber('root')['service']):
                        (sub,alert_body)=thresholdCheck(service,'',thresholdType)
                        if ( sub != ''):
                                sendmail(service,alert_header+alert_body+alert_footer,sub)

main()

