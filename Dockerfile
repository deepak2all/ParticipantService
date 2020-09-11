FROM openjdk:8
ADD target/Participant-Service-0.0.1-SNAPSHOT.jar participant-service-mysql.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "participant-service-mysql.jar"]