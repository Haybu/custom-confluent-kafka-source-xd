Spring XD project to source from Confluent Kafka
================================================

This project helps to stream out from a confluent kafka topic(s). Avro is supported out of the box
by Confluent with a feature of Avro Registry. The project extends OOB Spring XD kafka source to 
support reading from confluent's kafka.

Build Project
=============

clone this project and Use: mvn clean install

Register the module
===================

With Spring XD stand-alone or distributed servers running (admin / containers), register the module's 
uber jar file using the following command from Spring XD Shell:

module upload --name kafka-confluent --file /Users/hmohamed/.m2/repository/com/jupital/streams/confluent-kafka-source-xd/0.0.1-SNAPSHOT/confluent-kafka-source-xd-0.0.1-SNAPSHOT.jar --type source

Create a stream
===============

For a quick test, you can can create a stream to read from a confluent's Kafka and sink to a log.

stream create mykafkasource1 --definition "kafka-confluent --zkconnect=localhost:2181 --topic=catalog --registryUrl=http://localhost:8081 --autoCommit=false | log" --deploy
