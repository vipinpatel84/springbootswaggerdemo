#ARG is to pass the Value it is kind of variable declaration in Docker, only command which can be written before FROM
ARG MESSAGE=latest

# FROM is the base image command, It will pull image from Docker hub or registry
FROM openjdk:$MESSAGE

# It execute commands at run-time during  build, takes value in JSON Array
RUN echo $MESSAGE > image_version
RUN ["/bin/bash", "ls", "echo $MESSAGE"]

# CMD doesn't execute Commands at run time, Main purpose is to provide default for executing container.
# Used to provide args for EntryPoint
CMD [ "sh", "-c", "echo $HOME" ]

#Labels are Key value pair, define in Docker image, Multiple key:value pair can be define in docker fie
LABEL version="1.0" application="swagger springboot application"


ADD target/swagger-0.0.1-SNAPSHOT.jar swagger.jar

# EXPOSE Specify Docker, that it listen to specifc port at runtime. TCP is default port. UDP/TCP
EXPOSE 8080

# ENV is use to set ENV variable in container, it can be override by --env key=value
ENV dev=dvp

ENTRYPOINT ["java","-jar" ,"swagger.jar"]