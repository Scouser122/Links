FROM openjdk:17-oracle

COPY /build/libs/links-0.0.1.jar /home/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/home/app.jar"]



