FROM openjdk:17 AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build

FROM openjdk:17 AS runner
COPY --from=build /home/gradle/src/build/libs/building-a-restful-web-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
