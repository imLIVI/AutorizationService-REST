FROM openjdk:17-oracle

EXPOSE 8080

COPY target/HW2_1_AutorizationService-0.0.1-SNAPSHOT.jar authorizationService.jar

CMD ["java", "-jar", "authorizationService.jar"]