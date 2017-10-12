FROM openjdk:8
ADD target/spring-boot-websocket-demo-1.5.6.RELEASE.jar spring-boot-websocket-demo-1.5.6.RELEASE.jar
EXPOSE 9191
ENTRYPOINT ["java", "-jar", "spring-boot-websocket-demo-1.5.6.RELEASE.jar"]