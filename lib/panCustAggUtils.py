from pyspark import SparkContext, SparkConf
from pyspark.sql import HiveContext, Row
from pyspark.sql.types import *

import json
import inspect
import math
import datetime
# import testData





def addToList (theList, theVal):
    if theVal:
        theList += theVal
    return theList

def combineLists (l1, l2):
    retVal = []
    if l1:
        retVal = retVal + l1
    if l2:
        retVal = retVal + l2
    return retVal

def getValByKey (jsonObj, keyPath):
    try:
        retVal = jsonObj
        keys = keyPath.split('/')
        for key in keys:
            retVal = retVal[key]
            if isinstance(retVal, list):
                retList = []
                for listVal in retVal:
                    if isinstance(listVal, dict):
                        retList.append(listVal[keys[-1]])
                    else:
                        retList.append(listVal)
                return retList
        return retVal
    except:
        return None


def getFloatByKey (jsonObj, keyPath):
    try:
        return float(getValByKey (jsonObj, keyPath))
    except:
        return None

def sumFloatListByKey (jsonObj, keyPath):
    try:
        retVal = 0.0
        theFloatList = getValByKey (jsonObj, keyPath)
        for val in theFloatList:
            retVal += float(val)
        return retVal
    except:
        return None

def getLongListByKey (jsonObj, keyPath):
    try:
        retVal = []
        rawValue = getValByKey (jsonObj, keyPath)
        if not isinstance (rawValue, list):
            retVal.append (long (rawValue))
        else:
            for val in rawValue:
                retVal.append( long (val))
        return retVal
    except:
        return None

def getLongByKey (jsonObj, keyPath):
    try:
        return long(getValByKey (jsonObj, keyPath))
    except:
        return None

def getTypedValByKey (jsonObj, keyPath, valueType):
    try:
        if valueType == "String":
            return str(getValByKey (jsonObj, keyPath))
        elif valueType == "Long":
            return long(getValByKey (jsonObj, keyPath))
        elif valueType == "Float":
            return float(getValByKey (jsonObj, keyPath))
    except:
        return None

def _list_to_tuple (inList):
    listStr = unicode (inList)
    tplStr = "(" + listStr[1:-1] + ")"    
    return eval(tplStr)


#def _filter_on_dim ( v_filtered, stage, broadcast_values):
#
#    retVal = []
#
#    print "DEBUG in _filter_on_dim"
#
#    dimAttribute = stage['dimAttribute']
#    dimTableName = stage['dimTableName']
#    joinColumns = eval(stage['joinColumns'])
#    attributeValues = eval(stage['attributeValues'])
#    inNotInFlag = stage['inNotInFlag']
#
#    dim_dictionary = broadcast_values['dimensions'][dimTableName]
#
#    
#    for listRec in v_filtered:
#        keyList = []
#        for joinColumn in joinColumns:
#            keyList.append(getLongByKey (listRec, joinColumn))
#
#        dimKey = _list_to_tuple (keyList)
#      
#        if dimKey in dim_dictionary:
#            dimAttrValue = dim_dictionary[dimKey][dimAttribute]
#            if dimAttrValue in attributeValues and inNotInFlag == 1:
#                retVal.append(listRec)
#            elif dimAttrValue not in attributeValues and inNotInFlag == 0:
#                retVal.append(listRec)
#
#    return retVal

def _filter_on_dim ( v_filtered, stage, broadcast_values):

    retVal = []

    dimAttribute = stage['dimAttribute']
    dimTableName = stage['dimTableName']
    joinColumns = eval(stage['joinColumns'])
    attributeValues = eval(stage['attributeValues'])
    inNotInFlag = stage['inNotInFlag']
    dim_dictionary = broadcast_values['dimensions'][dimTableName]

    maxJoinColumnLevel = 0
    for joinColumn in joinColumns:
        joinColumnLevel = len(joinColumn.split('/'))
        if joinColumnLevel > maxJoinColumnLevel:
            maxJoinColumnLevel = joinColumnLevel


    if maxJoinColumnLevel == 1:
        for listRec in v_filtered:
            print listRec
            keyList = []
            for joinColumn in joinColumns:
                keyList.append(getLongByKey (listRec, joinColumn))

            dimKey = _list_to_tuple (keyList)

            if dimKey in dim_dictionary:
                dimAttrValue = dim_dictionary[dimKey][dimAttribute]
                if dimAttrValue in attributeValues and inNotInFlag == 1:
                    retVal.append(listRec)
                elif dimAttrValue not in attributeValues and inNotInFlag == 0:
                    retVal.append(listRec)

    elif maxJoinColumnLevel == 2 and len(joinColumns) == 1:
        print "in elif"
        for listRec in v_filtered:
            dimKeyList = getLongListByKey (listRec, joinColumns[0])
            print dimKeyList

            found = False
            for dimKey in dimKeyList:
                if dimKey in dim_dictionary:
                    dimAttrValue = dim_dictionary[dimKey][dimAttribute]
                    if dimAttrValue in attributeValues:
                        found = True
            if found and inNotInFlag == 1:
                retVal.append(listRec)
            if not found and inNotInFlag == 0:
                retVal.append(listRec)

    return retVal


def _pivot_min_max_on_dim (v_filtered, stage, broadcast_values):
    retVal = {}


    dimAttribute = stage['pivot']['dimAttribute']
    factValue = stage['pivot']['factValue']
    factType = stage['pivot']['factType']
    dimTableName = stage['pivot']['dimTableName']
    joinColumns = eval(stage['pivot']['joinColumns'])
    minMax = stage['pivot']['minMax']

    dim_dictionary = broadcast_values['dimensions'][dimTableName]


    factValueLevel = len(factValue.split('/'))
    maxJoinColumnLevel = 0
    for joinColumn in joinColumns:
        joinColumnLevel = len(joinColumn.split('/'))
        if joinColumnLevel > maxJoinColumnLevel:
            maxJoinColumnLevel = joinColumnLevel


    for listRec in v_filtered:
        keyList = []
        for joinColumn in joinColumns:
            keyList.append(getLongByKey (listRec, joinColumn))

        dimKey = _list_to_tuple (keyList)

        if dimKey in dim_dictionary:
            dimAttrValue = dim_dictionary[dimKey][dimAttribute]
            theValue = getTypedValByKey (listRec, factValue, factType)
            

            if theValue:
                if dimAttrValue not in retVal:
                    retVal[dimAttrValue] = theValue
                if maxJoinColumnLevel == 1 and factValueLevel == 1:
                    if theValue > retVal[dimAttrValue] and minMax == 'max':
                        retVal[dimAttrValue] = theValue
                    if theValue < retVal[dimAttrValue] and minMax == 'min':
                        retVal[dimAttrValue] = theValue
             

    return retVal
    
def _pivot_min_max (v_filtered, stage):
    retVal = {}

    factValue = stage['pivot']['factValue']
    factType = stage['pivot']['factType']
    minMax = stage['pivot']['minMax']


    factColName = factValue.split('/')[-1]

    for listRec in v_filtered:
        theValue = getTypedValByKey (listRec, factValue, factType)
            

        if theValue:
            if factColName not in retVal:
                retVal[factColName] = theValue
            if theValue > retVal[factColName] and minMax == 'max':
                retVal[factColName] = theValue
            if theValue < retVal[factColName] and minMax == 'min':
                retVal[factColName] = theValue
             

    return retVal
    
def _pivot_sum_on_dim (v_filtered, stage, broadcast_values):

    # Join v_filtered to the dimension specified in stage.  Sum up the values
    # pointed to factValue in stage by the dimAttribute specified in the stage
    # This can work when the join to the dimension has multiple columns.
    #
    # Look at the levels of the fact and join column specifications.
    # The factValue column can be below the level of the joinColumns


    retVal = {}

    dimAttribute = stage['pivot']['dimAttribute']
    factValue = stage['pivot']['factValue']
    dimTableName = stage['pivot']['dimTableName']
    joinColumns = eval(stage['pivot']['joinColumns'])


    dim_dictionary = broadcast_values['dimensions'][dimTableName]


    factValueLevel = len(factValue.split('/'))
    maxJoinColumnLevel = 0
    for joinColumn in joinColumns:
        joinColumnLevel = len(joinColumn.split('/'))
        if joinColumnLevel > maxJoinColumnLevel:
            maxJoinColumnLevel = joinColumnLevel

    if  maxJoinColumnLevel == 1 and factValueLevel in [1,2]:

        for listRec in v_filtered:
            keyList = []
            for joinColumn in joinColumns:
                keyList.append(getLongByKey (listRec, joinColumn))
    
            dimKey = _list_to_tuple (keyList)
    
    
            if dimKey in dim_dictionary:
                dimAttrValue = dim_dictionary[dimKey][dimAttribute]
                if dimAttrValue not in retVal:
                    retVal[dimAttrValue] = 0
                if maxJoinColumnLevel == 1 and factValueLevel == 1:
                    retVal[dimAttrValue] += getFloatByKey (listRec, factValue)
                if maxJoinColumnLevel == 1 and factValueLevel == 2:
                    retVal[dimAttrValue] += sumFloatListByKey (listRec, factValue)

    elif maxJoinColumnLevel == 2 and factValueLevel == 2:

        for listRec in v_filtered:

            # At level 1 factValue and each element of joinColumns should be the same.  This should allow us to
            # get a list of dictionaries

            level1Key = factValue.split('/')[0]
            level2Key = factValue.split('/')[1]
            level2List = listRec[level1Key]
            for curDict in level2List:
                keyList = []
                for joinColumn in joinColumns:
                    level2Col = joinColumn.split('/')[1]
                    keyList.append(getLongByKey(curDict,level2Col))

                dimKey = _list_to_tuple (keyList)

                if dimKey in dim_dictionary:
                    dimAttrValue = dim_dictionary[dimKey][dimAttribute]
                    if dimAttrValue not in retVal:
                        retVal[dimAttrValue] = 0
                    level2Value = getFloatByKey(curDict, level2Key )
                    if not level2Value:
                        level2Value = 0
                    retVal[dimAttrValue] += level2Value



    return retVal







def _pivot_count_distinct_on_dim (v_filtered, stage, broadcast_values):


    retVal = {}



    dimAttribute = stage['pivot']['dimAttribute']
    factValue = stage['pivot']['factValue']
    dimTableName = stage['pivot']['dimTableName']
    joinColumns = eval(stage['pivot']['joinColumns'])

    dim_dictionary = broadcast_values['dimensions'][dimTableName]



    factValueLevel = len(factValue.split('/'))
    maxJoinColumnLevel = 0
    for joinColumn in joinColumns:
        joinColumnLevel = len(joinColumn.split('/'))
        if joinColumnLevel > maxJoinColumnLevel:
            maxJoinColumnLevel = joinColumnLevel

    for listRec in v_filtered:
        dimKeyLists = []
        for joinColumn in joinColumns:
            dimKeyLists.append(getValByKey (listRec, joinColumn))


        if len(dimKeyLists) > 0:
            if isinstance(dimKeyLists[0], list):
                numKeyLists = len(dimKeyLists[0])
                for keyPos in range(numKeyLists):
                    curKeyList = []
                    for dimKeyList in dimKeyLists:
                        curKeyList.append(dimKeyList[keyPos])
                    dimKey = _list_to_tuple (curKeyList)
    
                    if dimKey in dim_dictionary:
                        dimAttrValue = dim_dictionary[dimKey][dimAttribute]
                        if dimAttrValue not in retVal:
                            retVal[dimAttrValue] = set()
                        theValue = getValByKey(listRec, factValue)
                        if theValue:
                            retVal[dimAttrValue].add(theValue)
            else:
                dimKey = _list_to_tuple (dimKeyLists)
                if dimKey in dim_dictionary:
                    dimAttrValue = dim_dictionary[dimKey][dimAttribute]
                    if dimAttrValue not in retVal:
                        retVal[dimAttrValue] = set()
                    theValue = getValByKey(listRec, factValue)
                    if theValue:
                        retVal[dimAttrValue].add(theValue)
                


    for key in retVal.keys():
        retVal[key] = len(retVal[key])
             

    return retVal


    
def _pivot_last_n_dates (v_filtered, stage, broadcast_values):


    # Get the last num_vals order dates in the data.  This is normally done
    # after a filter.
    retVal = {}

    # A dictionary of all dates found.
    dateDict = {}

    # Get the number of dates to collect from the stage
    num_vals = stage['pivot']['num_vals']

    # Setup the format string of the key to use.  We need to figure out the number of leading zeros needed
    # to have the dictionary entry begin with a letter to that it can be used as a column name while
    # still sorting numerically.
    padding_needed = int(math.ceil(math.log10(num_vals)))
    keyFmt = "D%%0%dd" % padding_needed

    # Retrun D1 thru Dn.  Initialize all dates to None
    for valOffset in range(0,num_vals):
        key = keyFmt % (valOffset + 1)
        retVal[key] = None

    # Iterate through the data pulling out the business_date values and putting
    # them into a dictionary that will later be sorted.
    for listRec in v_filtered:
        business_date_date = listRec['business_date']
        dateDict[business_date] = 1

    # Sort the keys of the dictionary in reverse order go give us the last dates in the data.
    dateKeys = dateDict.keys()
    dateKeys.sort(reverse=True)

    # Iterate through the sorted dates copying them to the returned dictionary.  Break out of the loop
    # if we have more then num_vals visits.
    valOffset = 1
    for dateKey in dateKeys:
        outputKey = keyFmt % valOffset
        retVal[outputKey] = dateKey 
        valOffset += 1
        if valOffset > num_vals:
            break
        
             

    return retVal


def tryBroadcast (v):

    return [ v, broadcast_specs.value['queryRange']['queryEndDate']] 


def _applyStageFilters ( v_filtered, stage, broadcast_values ):

    retVal = v_filtered

    for filterSpec in stage['filters']:
        if filterSpec['type'] == 'dim':
            retVal = _filter_on_dim ( retVal, filterSpec, broadcast_values)

    return retVal

def _filterStageDateRange (theList, stage):
    retVal = []
   
    startDate = stage['dateRange']['startDate']
    endDate = stage['dateRange']['endDate']

    for listVal in theList:
        if startDate <= listVal['business_date'] <= endDate:
            retVal.append(listVal)
    
    return retVal

def _applyStage (v, stage, broadcast_values):


    v_filtered = _filterStageDateRange (v, stage)

    if 'filters' in stage:
        v_filtered = _applyStageFilters (v_filtered, stage, broadcast_values )

    # Use text in stage to make the call to the right function
    functionName = stage['pivot']['functionName'] 

    if functionName == '_pivot_sum_on_dim':
        return _pivot_sum_on_dim (v_filtered, stage, broadcast_values) 
    elif functionName in ['_pivot_max_on_dim', '_pivot_min_on_dim' ]:
        return _pivot_min_max_on_dim (v_filtered, stage, broadcast_values) 
    elif functionName in ['_pivot_max', '_pivot_min' ]:
        return _pivot_min_max (v_filtered, stage) 
    elif functionName in ['_pivot_count_distinct_on_dim']:
        return _pivot_count_distinct_on_dim (v_filtered, stage, broadcast_values) 
    elif functionName in ['_pivot_last_n_dates']:
        return _pivot_last_n_dates (v_filtered, stage, broadcast_values) 


    
    

def _applyStages (v, broadcast_values):
    theStages = broadcast_values['stages']


    retVal = {'hub_cust_id' : v[0]}
    for stage in theStages:
        stageName = stage['stageName']
        retVal[stageName ] = _applyStage (v[1], stage, broadcast_values)

    return retVal

def _setup_for_dataframe ( theDict, theDFSpecList ):

    retVal = []
    for curSpec in theDFSpecList:
        keyName = curSpec['key']
        operation = curSpec['operation']
        typeName = curSpec['type']

        rawValue = theDict[keyName]
        if operation == 'top_value':
            if typeName == 'LongType' and rawValue:
                retVal.append(long(rawValue))
            else:
                retVal.append(None)

        elif operation == 'sub_value':
            if typeName == 'TimestampType' and rawValue:
                sub_value_list = rawValue.values()
                theTimestamp =  datetime.datetime.strptime(sub_value_list[0], '%Y-%m-%d')
                retVal.append(theTimestamp)
            else:
                retVal.append(None)

        elif operation == 'sum':
            if typeName == 'LongType' and rawValue:
                sumValue = 0L
                for curVal in rawValue.values():
                    sumValue += long(curVal)
                retVal.append(sumValue)
            else:
                retVal.append(0L)
        else:
            retVal.append(None)
    return retVal


class c360_stage:

    def __init__(self, stageName, theC360_specs, startDate, endDate):
        self.__specs = { 'stageName' : stageName, 
                         'dateRange' : { 'startDate' : startDate, 
                                         'endDate' : endDate 
                                       }
                       }
        self.__theC360_specs = theC360_specs

    def getSpecs(self):
        return self.__specs


    def pivot_sum_on_dim (self, dimAttribute, factValue, dimTableName, joinColumns):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['dimAttribute'] = dimAttribute
        self.__specs['pivot']['factValue'] = factValue
        self.__specs['pivot']['dimTableName'] = dimTableName
        self.__specs['pivot']['joinColumns'] = joinColumns
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self

    def pivot_max_on_dim (self, dimAttribute, factValue, factType, dimTableName, joinColumns):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['dimAttribute'] = dimAttribute
        self.__specs['pivot']['factValue'] = factValue
        self.__specs['pivot']['factType'] = factType
        self.__specs['pivot']['dimTableName'] = dimTableName
        self.__specs['pivot']['joinColumns'] = joinColumns
        self.__specs['pivot']['minMax'] = 'max'
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self

    def pivot_max (self, factValue, factType):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['factValue'] = factValue
        self.__specs['pivot']['factType'] = factType
        self.__specs['pivot']['minMax'] = 'max'
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self


    def pivot_min_on_dim (self, dimAttribute, factValue, factType, dimTableName, joinColumns):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['dimAttribute'] = dimAttribute
        self.__specs['pivot']['factValue'] = factValue
        self.__specs['pivot']['factType'] = factType
        self.__specs['pivot']['dimTableName'] = dimTableName
        self.__specs['pivot']['joinColumns'] = joinColumns
        self.__specs['pivot']['minMax'] = 'min'
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self



    def pivot_min (self, factValue, factType):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['factValue'] = factValue
        self.__specs['pivot']['factType'] = factType
        self.__specs['pivot']['minMax'] = 'min'
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self



    def pivot_count_distinct_on_dim (self, dimAttribute, factValue, dimTableName, joinColumns):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['dimAttribute'] = dimAttribute
        self.__specs['pivot']['factValue'] = factValue
        self.__specs['pivot']['dimTableName'] = dimTableName
        self.__specs['pivot']['joinColumns'] = joinColumns
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self


    def pivot_last_n_dates (self, n):
        self.__specs['pivot'] = {}
        self.__specs['pivot']['num_vals'] = n
        self.__specs['pivot']['functionName'] = '_' + inspect.stack()[0][3]

        return self

    
    def filter_on_dim (self, dimAttribute, dimTableName, joinColumns, attributeValues, inNotInFlag):
        if 'filters' not in self.__specs:
            self.__specs['filters'] = []
        filterSpec = {}
        filterSpec['type'] = 'dim'
        filterSpec['dimAttribute'] = dimAttribute
        filterSpec['dimTableName'] = dimTableName
        filterSpec['joinColumns'] = joinColumns
        filterSpec['attributeValues'] = attributeValues
        filterSpec['inNotInFlag'] = inNotInFlag
        self.__specs['filters'].append(filterSpec)

        return self

class c360_specs:



    def __init__(self, theHiveContext, envVal, queryStartDate, queryEndDate, hub_cust_id_list = None, testRDD = None ):

        self.__theHiveContext = theHiveContext
        self.__envVal = envVal

        self.__maxTestSize = 100


        self.__specDict = {
                            'queryRange' : {'queryStartDate' : queryStartDate, 'queryEndDate' : queryEndDate},
                            'dimensions' : {},
                            'envVal' : self.__envVal,
                            'stages' : []
                        }

        if hub_cust_id_list:
            self.__specDict['hub_cust_id_list'] = hub_cust_id_list


        self.__initialRDD = testRDD

    def getSpecDict (self):
        return self.__specDict

    def addStage (self, theStage):
        self.__specDict['stages'].append(theStage.getSpecs())
        return self

    def _getHiveContext (self):
        return self.__theHiveContext()

    def _addDimension (self, dim_name, dim_dictionary):
        self.__specDict['dimensions'][dim_name] = dim_dictionary

    def _addSqlTemplate (self, sqlTemplate):
        self.__sqlTemplate = sqlTemplate


    def _setupDfFromSql (self, sc):
        specDict = self.getSpecDict()
        queryStartDate = specDict['queryRange']['queryStartDate']
        queryEndDate = specDict['queryRange']['queryEndDate']
        envVal = specDict['envVal']
        theStages = specDict['stages']
        custListFilter = ''
        if 'hub_cust_id_list' in specDict:
            hub_cust_id_list = specDict['hub_cust_id_list']
            delim = ''
            custListFilter = "AND cod.hub_cust_id IN ( "
            for curCust in hub_cust_id_list:
                custListFilter += delim + str(curCust)
                delim = ", "
            custListFilter += " )"
    
    

        sqlStmt = self.__sqlTemplate.format(envVal=envVal, 
                                            queryStartDate=queryStartDate, 
                                            queryEndDate=queryEndDate, 
                                            custListFilter=custListFilter)


        return self.__theHiveContext.sql(sqlStmt)
    
    

    def _setupAggFromSql (self, sc):

        theDF = self._setupDfFromSql(sc)
        return theDF.rdd

    def _finalizeResults (self, sc):
    

        broadcast_specs = sc.broadcast (self.__specDict)

        finalRDD = self.__initialRDD.map(lambda v: (v['hub_cust_id'], json.loads(v['json_string'])))\
                                    .combineByKey (lambda v: v, addToList, combineLists)\
                                    .repartition (3000)\
                                    .map(lambda v:  _applyStages(v, broadcast_specs.value))
    
        return finalRDD

    def _getResultsFromTemplate ( self, sc):

        if not self.__initialRDD:
           self.__initialRDD = self._setupAggFromSql(sc) 
        return self._finalizeResults ( sc )

        
    def getCust360RDD (self, sc):

        myRDD = self._getResultsFromTemplate ( sc)

        return myRDD

    def gen_schema (self, theDFSpecList):

        fieldList = []
        for curSpec in theDFSpecList:
            columnName = curSpec['columnName']
            theType = eval(curSpec['type'] + "()")
            fieldList.append( StructField(columnName, theType, True))
    
        theSchema = StructType(fieldList)

        return theSchema

    
    def getCust360DF (self, theSparkSession, theDFSpecList ):

        theRDD = self._getResultsFromTemplate ( theSparkSession.sparkContext )\
                     .map( lambda v: _setup_for_dataframe ( v, theDFSpecList ))

        theSchema = self.gen_schema(theDFSpecList)

        return theSparkSession.createDataFrame(theRDD, theSchema)

    def writeTestFiles (self, sc, testDir, testName):

        self.__initialRDD = self._setupAggFromSql(sc)
        self.__initialRDD.persist()

        inputFileName = testDir + "/inputs/" + testName + ".inp"
        inputFile = open(inputFileName, "w")
        for curRow in self.__initialRDD.take(self.__maxTestSize):
            inputFile.write(str(curRow) + "\n")
        inputFile.close()

        myRDD = self._getResultsFromTemplate ( sc)
        resultFileName = testDir + "/results/" + testName + ".res"
        resultFile = open(resultFileName, "w")
        resultList = []
        for curDict in  myRDD.take(self.__maxTestSize): 
            resultList.append(json.dumps(curDict, sort_keys=True))

        resultList.sort()
        for resultJsonStr in resultList:
            resultFile.write(resultJsonStr + "\n")
        resultFile.close()

        self.__initialRDD.unpersist()
                    
    def runTest (self, sc, testDir, testName):


        inputFileName = testDir + "/inputs/" + testName + ".inp"
        inputFile = open(inputFileName, "r")
        rowList = []
        for rowStr in inputFile:
            rowList.append(eval(rowStr))

        inputFile.close()

        self.__initialRDD = sc.parallelize(rowList)

        resultRDD = self._finalizeResults ( sc )
        resultList = []
        for curDict in  resultRDD.take(self.__maxTestSize): 
            resultList.append(json.dumps(curDict, sort_keys=True))

        resultList.sort()




        refFileName = testDir + "/results/" + testName + ".ref"
        refFile = open(refFileName, "r")
        refList = []
        for curRef in refFile:
            refList.append(curRef.strip())

        compare_to_ref = cmp(resultList, refList)
        if compare_to_ref != 0:

            resultFileName = testDir + "/results/" + testName + ".res"
            resultFile = open(resultFileName, "w")
            for resultJsonStr in resultList:
                resultFile.write(resultJsonStr + "\n")
            resultFile.close()

        return compare_to_ref
            
                    
class c360_ord_specs (c360_specs):


    def __init__(self, theHiveContext, envVal, queryStartDate, queryEndDate, hub_cust_id_list = None, testRDD = None ):

        c360_specs.__init__(self, theHiveContext, envVal, queryStartDate, queryEndDate, hub_cust_id_list, testRDD )

        sqlStmt = """SELECT *
                       FROM {envVal}_edw.dim_product""".format(envVal=envVal)

        prodDict = {}
        for productRow in theHiveContext.sql(sqlStmt).collect():
            prodDict[productRow['product_code']] = productRow

        self._addDimension ('dim_product', prodDict)


        sqlStmt = """SELECT *
                       FROM {envVal}_edw.dim_star_qtr_hour""".format(envVal=envVal)


        qtrHourDict = {}
        for qtrHourRow in theHiveContext.sql(sqlStmt).collect():
            qtrHourDict[qtrHourRow['qtr_hour_dw_id']] = qtrHourRow

        self._addDimension ('dim_star_qtr_hour', qtrHourDict)

        sqlStmt = """SELECT *
                       FROM {envVal}_edw.dim_ord_src_dest""".format(envVal=envVal)

        srcDestDict = {}
        for srcDestRow in theHiveContext.sql(sqlStmt).collect():
            srcDestPair = ( srcDestRow['z_ord_src_sys_dw_id'], srcDestRow['z_ord_dest_dw_id'])
            srcDestDict[srcDestPair] = srcDestRow

        self._addDimension ('dim_ord_src_dest', srcDestDict)
        

        sqlTemplate = """SELECT cod.hub_cust_id,
                                cod.period_end_date,
                                dsd.day as web_registration_date,
                                cod.line_item_json as json_string
                          FROM (SELECT DISTINCT period_end_date
                                  FROM {envVal}_edw.dim_star_day
                                 WHERE day >= '{queryStartDate}'
                                   AND day <= '{queryEndDate}') pd,
                               {envVal}_edw.c360_ord_dtl cod,
                               {envVal}_edw.dim_loy_cust dcust,
                               {envVal}_edw.dim_star_day dsd
                         WHERE pd.period_end_date = cod.period_end_date {custListFilter}
                           AND cod.hub_cust_id = dcust.hub_cust_id
                           AND dcust.web_registration_date_dw_id = dsd.z_day_dw_id {custListFilter}"""

        self._addSqlTemplate (sqlTemplate)

    # def getCust360RDD (self, sc):

#        myRDD = self._getResultsFromTemplate ( sc)

#        return myRDD



    def getSQLDataRDD (self, sc):
    
        myRDD = self._setupAggFromSql ( sc)

        return myRDD
    
       
    def getSQLDataDF (self, sc):
    
        myRDD = self._setupDfFromSql ( sc, self.sqlTemplate)

        return myRDD
    
       



