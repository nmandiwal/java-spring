This project has sample code for replicated ehcache using JMS, activeMQ, spring-boot for a basic REST API implementation.

Below ActiveMQ was used.
docker run --name='activemq' -d -p 8161:8161 -p 61616:61616 -p 61613:61613 -it --rm webcenter/activemq:5.14.3
