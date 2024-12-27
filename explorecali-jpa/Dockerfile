FROM  registry.hub.docker.com/eclipse-temurin:21-jre-ubi9-minimal
COPY  target/explorecali-jpa-3.0.0.jar /app/

ENTRYPOINT ["java", "-jar", "-Xms512m", "-Xmx1024m", "-XX:ParallelGCThreads=8", "-Dlog4j.debug","/app/PROJECTNAME.jar]