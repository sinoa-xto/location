# Build stage: build the app using Maven with Eclipse Temurin JDK 17 (multi-arch support)
FROM --platform=$BUILDPLATFORM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Run stage: use a lightweight OpenJDK 17 base image (multi-arch and compatible with Render)
FROM --platform=linux/amd64 openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
