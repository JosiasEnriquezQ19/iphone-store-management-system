# Etapa de construcción (build)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiar los archivos de configuración de Maven primero
COPY pom.xml .
# Descargar todas las dependencias
RUN mvn dependency:go-offline -B

# Copiar el resto del código fuente
COPY src ./src

# Construir la aplicación y omitir los tests
RUN mvn package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Variables de entorno para Java
ENV JAVA_OPTS="-Xmx512m -Xms256m"

# Copiar el JAR construido
COPY --from=build /app/target/*.jar app.jar

# Puerto expuesto (asegúrate de que coincida con el configurado en tu aplicación)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]