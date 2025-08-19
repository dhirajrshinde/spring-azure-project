 FROM openjdk:21
 EXPOSE 8082
 ADD target/amdocsb1.jar amdocsb1.jar
 ENTRYPOINT ["java","-jar","/amdocsb1.jar"]