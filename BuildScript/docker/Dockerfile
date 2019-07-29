FROM openjdk:latest

MAINTAINER wuchenyv1990

ARG release_jar
ENV RELEASE_JAR ${release_jar}

ENV JAVA_OPS -XX:MetaspaceSize=64M -Xmx104169K \
    -XX:MaxMetaspaceSize=64M -Xss228K -Xms104169K
ENV WORK_PATH /usr/local/project

WORKDIR ${WORK_PATH}
COPY ${RELEASE_JAR} ${WORK_PATH}

EXPOSE 8080

ENTRYPOINT java ${JAVA_OPS} -jar ${WORK_PATH}/${RELEASE_JAR}
