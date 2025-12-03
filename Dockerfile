# Use a stable JDK image
FROM eclipse-temurin:17-jdk

# Create a working directory in the container
WORKDIR /app

# Copy the built jar from Maven's target/ folder into the image
COPY target/MilestoneLibraryApplication-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app uses (Render will still inject PORT)
EXPOSE 8080

# Start the Spring Boot app
CMD ["java", "-jar", "app.jar"]
