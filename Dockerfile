FROM openjdk:17
EXPOSE 2375
ADD target/final-project-sof-int.jar final-project-sof-int.jar
ENTRYPOINT ["java","-jar", "/final-project-sof-int.jar"]