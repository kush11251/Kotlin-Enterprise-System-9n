FROM maven:3.9-eclipse-temurin-17
COPY . /app
WORKDIR /app
RUN mvn package
CMD ["java", "-jar", "target/app.jar"]