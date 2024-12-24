FROM maven:3.9-eclipse-temurin-17 AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM tomcat:11.0.0-M6-jdk17-temurin

ARG DEPLOY_DIR=/usr/local/tomcat/webapps/

COPY --from=builder /app/target/*.war ${DEPLOY_DIR}

COPY target/*.war ${DEPLOY_DIR}

RUN chmod 644 ${DEPLOY_DIR}/*.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
