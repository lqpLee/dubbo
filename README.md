# dubbo
dubbo test
### zookeeper
#### install zookeeper 
```
docker pull zookeeper
```
#### run
```
docker run -d \
-p 2181:2181 \
-v /mysoft/zookeeper/data/:/data/ \
--name=zookeeper  \
--privileged zookeeper
```
### provider
#### package
```
mvn clean install
```
#### provider
```
cd dubbo-provider/target
java -jar dubbo-provider-1.0-SNAPSHOT.jar
```
#### consumer
```
cd /dubbo-consuner/target
java -jar dubbo-consuner-1.0-SNAPSHOT.jar
```
### visit
```
http://127.0.0.1:7002/dubbo/sayHello
```
