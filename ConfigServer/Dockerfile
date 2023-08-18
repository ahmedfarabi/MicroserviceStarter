FROM eclipse-temurin:17-jdk-focal

 # Refer to Maven build -> finalName
 ARG JAR_FILE=target/config-server-0.0.1-SNAPSHOT.jar

 # cd /opt/app
 WORKDIR /opt/app

 # cp target/{jarfileName}.jar /opt/app/app.jar
 COPY ${JAR_FILE} app.jar

 # java -jar /opt/app/app.jar
 ENTRYPOINT ["java","-jar","app.jar"]

