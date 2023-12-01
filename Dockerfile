FROM alpine:3.5
EXPOSE 8080
ADD target/final-project-sof-int.jar final-project-sof-int.jar
ENTRYPOINT ["java","-jar", "/final-project-sof-int.jar"]