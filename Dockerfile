FROM openjdk:17-oracle
ADD ./build/libs/*.jar sjoh-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
