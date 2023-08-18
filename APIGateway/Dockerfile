FROM eclipse-temurin:17-jdk-focal

EXPOSE 9090

 # Refer to Maven build -> finalName
 ARG JAR_FILE=target/api-gateway-0.0.1-SNAPSHOT.jar

 # cd /opt/app
 WORKDIR /opt/app

 # cp target/{jarfileName}.jar /opt/app/app.jar
 COPY ${JAR_FILE} app.jar

 # java -jar /opt/app/app.jar
 ENTRYPOINT ["java","-jar","app.jar"]