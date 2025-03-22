FROM openjdk:17
COPY ./target/ecommerce-backend.jar /app/ecommerce-backend.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "ecommerce-backend.jar"]