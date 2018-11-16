# coding: utf-8

# In[4]:


## Let's configure
# Establish environment - PJ's script
import os
import sys
os.environ["JAVA_HOME"] = "/usr/java/jdk1.7.0_67-cloudera"
os.environ['PATH']
os.environ['PYSPARK_PYTHON'] = "/opt/cloudera/parcels/Anaconda/bin/python2.7"
os.environ["SPARK_HOME"] = "/opt/cloudera/parcels/SPARK2/lib/spark2"
os.environ["PYLIB"] = "/opt/cloudera/parcels/SPARK2/lib/spark2/python/lib"
sys.path.insert(0, os.environ["PYLIB"] +"/py4j-0.10.4-src.zip")
sys.path.insert(0, os.environ["PYLIB"] +"/pyspark.zip")


# Establish PySpark
from pyspark import SparkContext,SparkConf, SQLContext
from pyspark.sql import HiveContext, SparkSession

# Bring in panSparkUtils
sys.path.append('/opt/panera/dev/lib')

import panSparkUtils

conf = panSparkUtils.pan_conf_level("Brads Awesome PySpark Job"
                                    , memory='Low'
                                    , priority = 'Low'
                                    , display=1).set('spark.driver.memory','2g')

import panConfig

# Establish Spark Session - John's script
sc = SparkContext(conf=conf)
theSessionContext = SparkSession(sc).builder.enableHiveSupport().getOrCreate()
theSessionContext.conf.set("spark.sql.parquet.writeLegacyFormat","true")
sparkVersion = sc.version
sc.setLogLevel("WARN")
print "Complete Initialization!"


# In[67]:


data = sc.textFile('/user/bknoblau/dev_hive_recos.dat')


# In[68]:


data.getNumPartitions()


# In[69]:


data.first().split('\t')


# In[72]:


data.count()


# In[97]:


dataRow = data.map(lambda line: line.split("\t")[:])


# In[47]:


#from pyspark.sql import Row
#from pyspark.sql.types import *


# In[98]:


dataRow.take(1)


# In[94]:


dataRow.distinct().count()


# In[38]:


sqlContext = SQLContext(sc)


# In[ ]:


dfData = sqlContext.createDataFrame(dataRow).toDF("basket_hash", "baskey_key", "payload")


# In[40]:


dfData.show()


# In[41]:


dfData.printSchema()


# In[43]:


dfData.first()


# In[51]:


schema = StructType([StructField("basket_hash", StringType(), True),
                     StructField("baskey_key", StringType(), True),
                     StructField("payload", StringType(), True)]
                   )


# In[63]:


newDf = dfData.repartition(25)


# In[64]:


newDf.rdd.getNumPartitions()


# In[65]:


sc.stop()