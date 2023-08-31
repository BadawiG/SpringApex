# Use an OpenJDK image as the base image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR file and the pom.xml to the container
COPY spring-boot-3-jwt-security-main/target/security-0.0.1-SNAPSHOT.jar /app/app.jar
COPY spring-boot-3-jwt-security-main/pom.xml /app/pom.xml

# Expose port 8080 (change this if your application listens on a different port)
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]