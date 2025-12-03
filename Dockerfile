# Use a stable JDK image
FROM eclipse-temurin:17-jdk

# Create working directory
WORKDIR /app

# Copy the built jar FROM Maven target folder
COPY target/MilestoneLibraryApplication-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Render overrides this)
EXPOSE 8080

# Start the Spring Boot app
CMD ["java", "-jar", "app.jar"]
