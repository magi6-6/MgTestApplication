FROM openjdk:8-jdk-alpine

EXPOSE 8070

ADD mg-cloud-business-1.0-SNAPSHOT.jar mg-cloud-business.jar


ENTRYPOINT ["java", "-jar", "/mg-cloud-business.jar", "--spring.profiles.active=prod"]