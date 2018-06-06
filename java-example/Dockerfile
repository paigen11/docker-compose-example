FROM openjdk:8-jdk-alpine
# create the directory for where Tomcat creates its working directories
VOLUME /tmp
ARG JAR_FILE
# copy the project JAR file to the container renamed as 'app.jar'
COPY build/libs /app
# execute that JAR in the entry point below
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/java-example.jar"]