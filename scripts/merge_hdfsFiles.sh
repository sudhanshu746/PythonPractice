#!/bin/bash
###################################
# Script merge files per day   ####
###################################


day=1
date_string=$(date -d"${day} day ago" +'%Y%m%d')
sourceDir='/work/ceh/wrkceh01_d1/busevents_error_maddi/avro'
destDir='/work/ceh/wrkceh01_d1/busevents_error_maddi/avro'

hdfs dfs -getmerge ${sourceDir}/${date_string}* ${destDir}/mergeOutputFile_${date_string}