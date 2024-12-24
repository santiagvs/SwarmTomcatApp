FROM tomcat:11.0.0-M6-jdk17-temurin

ARG DEPLOY_DIR=/usr/local/tomcat/webapps/

COPY target/*.war ${DEPLOY_DIR}

RUN chmod 644 ${DEPLOY_DIR}/*.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
