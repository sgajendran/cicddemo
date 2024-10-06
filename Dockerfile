FROM openjdk:17
WORKDIR /app
COPY ./target/cicddemo-0.0.1-SNAPSHOT.jar /app
EXPOSE 80
CMD ["java", "-jar", "cicddemo-0.0.1-SNAPSHOT.jar"]