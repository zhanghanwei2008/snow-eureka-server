FROM  192.168.31.107:5000/java8:latest
VOLUME /tmp
ADD snow-eureka-server-0.0.1-SNAPSHOT.jar  app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]