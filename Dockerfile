# ---- Step 1: Build with Maven 3.6.3 and Java 21 ----
FROM maven:3.6.3-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ---- Step 2: Run with Java 21 ----
FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
