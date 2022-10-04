sudo docker stop sample

sudo docker rm sample

sleep 3

sudo docker build -t springio/camunda-aws-test .

sleep 5

sudo docker run -p 8091:8091 -p 8192:8192  -e JAVA_OPTS="-Xms256m -Xmx1058m -Dcom.sun.management.jmxremote.rmi.port=8192 -Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.port=8192 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.local.only=false -Djava.rmi.server.hostname=44.211.4.136" -d --name sample springio/camunda-aws-test