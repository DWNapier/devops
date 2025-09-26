FROM openjdk:latest
COPY target/devops-0.1.0.1-jar-with-dependencies.jar devops-0.1.0.1-jar-with-dependencies.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "devops-0.1.0.1-jar-with-dependencies.jar"]