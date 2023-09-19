FROM maven:3.8.3-openjdk-17 as builder 
#two stage build
WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -e

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/munozpage-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080
#expose endpoint
CMD ["java", "-jar", "app.jar"]
