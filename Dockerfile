# Use the official OpenJDK base image for Java
FROM openjdk:latest

# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/purchase-transaction-wex.jar /app/app.jar

# Expose the port your Spring Boot application listens on (default is 8080)
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
