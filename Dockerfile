FROM openjdk:17-oracle
ADD ./build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
