# Use the OpenJDK 21 image based on Alpine Linux
FROM openjdk:21-alpine

# Expose port 8080 for the application
EXPOSE 8080

# Add the Spring Boot JAR file to the Docker image
ADD target/spring-boot-docker.jar /spring-boot-docker.jar

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]