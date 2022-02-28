FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/spring-boot-elk-filebeat-with-db-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8880
ENTRYPOINT ["java", "-jar", "app.jar"]