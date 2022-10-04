# FROM openjdk:17-jdk-alpine
# expose 8091
# expose 8192
# ARG JAR_FILE=./target/*.jar
# COPY ${JAR_FILE} app.jar

# ENTRYPOINT ["java","-jar","/app.jar"]

FROM openjdk:17-jdk-alpine
expose 8091
expose 8192
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar