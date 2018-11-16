datafile=/tmp/data
topicfile=/tmp/topicfile


for topic  in `cat ${topicfile}`;do
timenow=$(date +'%s')
time5=$(date --date 'now + 1 minutes' +'%s')
while read line && [[ $timenow -le $time5  ]];do
echo $line|$KAFKA_HOME/bin/kafka-console-producer.sh --broker-list `hostname`:9092 --topic ${topic}
timenow=$(date +'%s')
done < ${datafile}
done