FROM openjdk:8-jdk-alpine

EXPOSE 8050

ADD mg-cloud-gateway-1.0-SNAPSHOT.jar mg-cloud-gateway.jar


ENTRYPOINT ["java", "-jar", "/mg-cloud-gateway.jar", "--spring.profiles.active=dev"]
