#!~/.conda/envs/ssharma/bin/python
######################################################
#### Monitoring script for Hadoop Services ###########
######################################################

import json
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
config.read('config/monitorpar.conf')

def config_grabber(section):
    temp = dict()
    for i in config.options(section):
        temp.update({i:config.get(section,i)})
    return temp


def sendmail(service,message):
        conf = config_grabber(service+"-mail")
        sender = conf['sender']
        receiver = conf['receiver']
        subject = conf['subject']
        smtpserver = conf['subject']
        msg = MIMEText(message, 'html', 'utf-8')
        msg['Subject'] = Header(subject, 'UTF-8')
        msg['From'] = sender
        msg['To'] = receiver
        smtp = smtplib.SMTP(smtpserver)
        smtp.sendmail(sender, [receiver], msg.as_string())
        smtp.quit()


def apply_operator(a, op, b):
    method = '__%s__' % op
    return getattr(str(a), method)(str(b))

def thresholdCheck(service,alert_msg,thresholdTypes=[]):
        request=Request(config_grabber(service+"-svc-config")["endpoint"])
        json_dump= urlopen(request).read()
        data = json.loads(json_dump)
        df=pd.DataFrame.from_records(data['beans'])
        for thresholdType in thresholdTypes:
                        for key in config_grabber(service)["attributes"].split(","):
                                if key in config_grabber(thresholdType).keys():
                                        value=config_grabber(thresholdType)[key]
                                        #if(apply_operator(value,thresholdType,df.loc[0][key])):
                                        if(apply_operator(str(df.loc[0][key]),thresholdType,value)):
                                                alert_msg += key+" value increased to "+str(df.loc[0][key])+".Imigiate action required\n"
                                                print(alert_msg)


def main():
        alert_body='';
        thresholdType=config_grabber('root')['thresholdTypes'].split(",")
        for service in config_grabber('root')['service'].split(","):
                thresholdCheck(service,alert_body,thresholdType)
                if ( alert_body != ''): sendmail(service,alert_body)

main()
