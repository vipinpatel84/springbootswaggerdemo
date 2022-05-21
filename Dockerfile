FROM openjdk
ADD target/swagger-0.0.1-SNAPSHOT.jar swagger.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" ,"swagger.jar"]