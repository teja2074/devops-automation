FROM openjdk:11
EXPOSE 8080
ADD targets/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java", "-jar","devops-integration.jar"]
