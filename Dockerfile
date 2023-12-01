FROM openjdk:8
EXPOSE 8080
ADD target/final-project-sof-int.jar final-project-sof-int.jar
ENTRYPOINT ["java","-jar", "/final-project-sof-int.jar"]