#设置引用的jdk环境容器
FROM jdk:17
#FROM centos7-java17:latest
LABEL version="1.0"
LABEL description=" hello world docker "
#目录是终端默认在此目录下
WORKDIR /app

#如果是到文件夹后面必须加上“/”,不然会找不到文件，./代表当前目录即是/app
COPY target/helloTest-0.0.1-SNAPSHOT.jar helloTest.jar
#开机执行
ENTRYPOINT ["java", "-jar", "helloTest.jar"]