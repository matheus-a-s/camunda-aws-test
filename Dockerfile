# FROM openjdk:17-jdk-alpine
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]

# # CMD java \
# #             # -XX:StartFlightRecording /home/ubuntu/camunda-aws-test/src/main/java/com/bpm/workflow/Application.java
# #             -XX:StartFlightRecording \
# #             -XX:StartFlightRecording=disk=true,filename=/tmp/jfr/recording.jfr,maxage=24h,dumponexit=true,path-to-gc-roots=true

FROM openjdk:17-jdk-alpine
expose 8091
expose 8192
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar