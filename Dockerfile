#
# Build stage
#
FROM maven:3.8.4-jdk-11 AS build
COPY src /src
COPY pom.xml .
RUN mvn -f /pom.xml clean package
#
# Run stage
#
FROM openjdk:11-jre-slim
COPY --from=build /target/Vol_conv.jar Vol_conv.jar
ENTRYPOINT ["java","-jar","Vol_conv.jar"]