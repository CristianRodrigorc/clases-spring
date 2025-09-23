# Imagen base de OpenJDK 21
FROM eclipse-temurin:21-jdk-jammy

#Directorio de trabajo
WORKDIR /app

#Copiar el archivo JAR generado por Maven
COPY target/miapp-0.0.1-SNAPSHOT.jar app.jar

#Puerto que expondrá el contenedor
EXPOSE 8080

#Comando para iniciar la aplicación
ENTRYPOINT [ "java","-jar","app.jar"]