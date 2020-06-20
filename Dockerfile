FROM openjdk:8-alpine

LABEL yqgcy xiexingxing
#ENV 变量

ENV TZ='Asia/Shanghai'
ENV DATA_API_ADDRESS=""
ENV APP_LOG_PATH=/data/logs

#RUN
RUN mkdir -p ${APP_LOG_PATH}

#COPY
COPY  ./target/jenkins.jar /root

#EXPOSE 服务端口

EXPOSE 8081

#ENTRYPOINT 启动命令

ENTRYPOINT java -jar  /root/jenkins.jar