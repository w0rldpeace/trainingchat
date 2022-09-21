FROM openjdk:19
MAINTAINER rk.home42@gmail.com
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]