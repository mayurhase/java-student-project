FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY Student.java StudentApp.java ./

RUN javac Student.java StudentApp.java

CMD ["java", "StudentApp"]
