FROM openjdk:8
ADD target/Participant-Service-0.0.1-SNAPSHOT.jar participant-Service-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "participant-Service-0.0.1-SNAPSHOT.jar"]