FROM openjdk:17-jdk-slim
LABEL maintainer="author@javatodev.com"
VOLUME /main-app
ADD build/libs/device-data-api-mysql-spring-boot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "/app.jar"]
