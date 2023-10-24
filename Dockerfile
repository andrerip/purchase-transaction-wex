FROM openjdk:latest
WORKDIR /app
COPY target/purchase-transaction-wex.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]