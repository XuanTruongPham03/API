#
# Build stage
#
FROM maven:3.9.6-amazoncorretto-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM amazoncorretto:17
COPY --from=build /target/API-0.0.1-SNAPSHOT.jar API-0.0.1-SNAPSHOT.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","API-0.0.1-SNAPSHOT.jar"]