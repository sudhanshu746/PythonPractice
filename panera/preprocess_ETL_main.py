##############################################################################################################################################################
###################### Combined Preprocessing ETL for Panera project #########################################################################################
###################### Script take parameters from config.txt ################################################################################################
###################### Create spark job will take care of ETL processing of Machine_Stats,Sale_data and Dynatrace ############################################
###################### Author : Sudhanshu Sharma    Version: 1.0   Date: 17/08/16  ###########################################################################
##############################################################################################################################################################



## Including Packages
import glob,re,os,time,collections,shutil,argparse,calendar,traceback,subprocess
from calendar import timegm
from collections import defaultdict
from dateutil.parser import parse
from string import maketrans
from pyspark.sql import DataFrame,SQLContext
from pyspark import SparkContext,SparkConf
import xml.etree.ElementTree as ET

conf = SparkConf().setAppName("PANERA_ETL_MAIN")
sc = SparkContext(conf=conf)
sqlContext = SQLContext(sc)

## Get Input Variables
orders_in = sc._conf.get("spark.orders.input")
machinestats_in = sc._conf.get("spark.machinestats.input")
dynatrace_in = sc._conf.get("spark.dynatrace.input")

## 
def hadoop_ls(file_glob):
  lines = subprocess.check_output(["/usr/bin/hadoop", "fs", "-ls", file_glob]).split("\n")
  files = [line.split()[7] for line in lines if len(line.split(" ")) > 3]
  return files
 
def dict_concat(a, b):
	# Concat dictionaries
    rval = a or {}
    rval.update(b or {})
    return rval
	
def extract_xml(obj):
	return obj.attrib['state']  + ',' + obj.attrib['name'] + ',' + obj.attrib['agent'] + ',' + obj.attrib['node_count'] + ',' + obj.attrib['start'] + ',' + obj.attrib['application'] + ',' + obj.attrib['response_time'];

def machinestats_createheader(dirname):
	data = sc.textFile(dirname+'*.txt');
	trantab = maketrans('"',' ')
	specialtab=maketrans('.|: ','____')
	try:
		parsed_rec_rdd = data.map(lambda a:str(a).strip().translate(trantab)).map(lambda s: map(lambda a: a.strip().translate(specialtab).lower(),str(s).split(','))).filter(lambda rec:(rec[0] != 'value' and len(rec) >= 4)).map(lambda rec:rec[3]).distinct()
	except(ValueError):
        	pass;
	attr=[]
	for file in hadoop_ls(dirname):
        	if re.search(r"([A-Za-z0-9]+)\_([A-Za-z]{3}).*?-.*?-([A-Za-z]+)\.([A-Za-z_]+)\_.*?$",file):
                	matched = re.search(r"([A-Za-z0-9]+)\_([A-Za-z]{3}).*?-.*?-([A-Za-z]+)\.([A-Za-z_]+)\_.*?$",file);
                	attr.append((matched.group(3) + '_' + matched.group(4)).lower());
	
	parsed_file_rdd = sc.parallelize(attr)

	# Concat attributes RDD collected from filename and file content without duplicate and save to given location
	final_attributes = parsed_rec_rdd.union(parsed_file_rdd)
	final_attributes.saveAsTextFile(dirname+'schema')
	#final_attributes.collect().saveAsTextFile(dirname+'schema')
	final_attributes.saveAsNewAPIHadoopFile(dirname+'schema',"org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat",keyClass="org.apache.hadoop.io.Text",valueClass="org.apache.hadoop.io.Text");

	
def machinestats_main(dirname):
	# Read attribute schema file from given directory
	schema = sc.textFile(dirname+'schema')
	data = sc.textFile(dirname+'*.txt')
	specialtab=maketrans('.|: ','____')
	# Parse RDDs
	schemaRDD = schema.map(lambda attr:(str(attr).lower(),0)).distinct()
	# dataRDD = data.filter(lambda a:(a.split(',')[0].lower() != '"value"')).map(lambda a:a.replace('"','')).map(lambda a:(a.split(',')[0],a.split(',')[1],a.split(',')[2],str(a.split(',')[3]).translate(specialtab),a.split(',')[4]))
	dataRDD = data.filter(lambda a:(a.split(',')[0].lower() != '"value"')).map(lambda a:a.replace('"','')).map(lambda a:(str(a.split(',')[3]).translate(specialtab).lower(),(a.split(',')[0],a.split(',')[1],str(calendar.timegm(parse(a.split(',')[2]).timetuple()) + 1))))

	# creating structure in format (timestamp,Server(attribute,Value))
	dj = schemaRDD.leftOuterJoin(dataRDD)
	
	# Create dictionary structure
	dataRDDmap = dj.map(lambda a:(a[1][1][2]+','+a[1][1][1],{a[0]: float(a[1][1][0]) if a[1][1] != 0 else '0' })).reduceByKey(dict_concat)
	# RDD to Data Frame
    	DF = dataRDDmap.values().toDF();
	# Write to Parquet format
	DF.write.parquet(dirname+'output_parquet')
	
def orders_etl(dirname):
	salesSource = sc.textFile(dirname);
	salesTimeClient = salesSource.map(lambda line: (timegm(time.strptime(line.split("|")[11], "%m/%d/%Y-%H:%M:%S")), str(line.split("|")[19])));

	salesTimeBucket = salesTimeClient.map(lambda line: ((int(line[0]/300)*300), line[1]));

	### FILTRATION
	class_mob = salesTimeBucket.filter(lambda rec: ("MOBILE" in rec[1])).map(lambda rec: (rec[0], 1)).sortByKey()
	class_mob_grouped = class_mob.reduceByKey(lambda rec1, rec2: (rec1 + rec2)).sortByKey()

	class_web = salesTimeBucket.filter(lambda rec: (rec[1] == "WEB") or (rec[1] == "APPLE_WATCH") or (rec[1] == "PAW")).map(lambda rec: (rec[0], 1)).sortByKey()
	class_web_grouped = class_web.reduceByKey(lambda rec1, rec2: (rec1 + rec2)).sortByKey()

	class_oth = salesTimeBucket.filter(lambda rec: (rec[1] == "")).map(lambda rec: (rec[0], 1)).sortByKey()
	class_oth_grouped = class_oth.reduceByKey(lambda rec1, rec2: (rec1 + rec2)).sortByKey()

	### JOIN
	ljoin_web_mob = class_web_grouped.leftOuterJoin(class_mob_grouped)
	ljoin_oth_web_mob = class_oth_grouped.leftOuterJoin(ljoin_web_mob).sortByKey()

	### Persist
	ljoin_oth_web_mob.saveAsTextFile("/user/parvinder/spark/etlorder")
	
def dynatrace(dirname):
	lines = sc.textFile(dirname);
	linesPurepath = lines.filter(lambda s:("<purepath sta" in s))
	attributeMap = linesPurepath.map(lambda a: extract_xml(ET.fromstring(a)))
	attributeMap.saveAsTextFile(dirname+"output")
	#attributeMapDF = attributeMap.toDF()
	#DF.write.parquet(dirname+"output_parquet")

	
def main():
	print "Executing ..."
	print "MachineStats_Input : "+machinestats_in;
	print "Orders_Input : "+orders_in;
	print "Dynatrace_Input : "+dynatrace_in;
	machinestats_createheader(machinestats_in)
	machinestats_main(machinestats_in)
	orders_etl(orders_in)
	dynatrace(dynatrace_in)
	print "MachineStats_Output : "+machinestats_in+'output';
	print "Orders_Output : "+orders_in+'output';
	print "Dynatrace_Output : "+dynatrace_in+'output';

if __name__ == "__main__":
	main()

