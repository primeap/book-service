FROM openjdk:8-jdk-alpine
COPY target/book-service-1.0.0.jar /home/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/app.jar"]