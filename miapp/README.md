# API de Gestión de Usuarios con Spring Boot

Este proyecto es una **API RESTful** desarrollada con **Spring Boot**, conectada a **PostgreSQL**, que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre usuarios.

---

## 🚀 Tecnologías utilizadas
- Java 21
- Spring Boot 3.5.6
- Spring Data JPA
- PostgreSQL (Supabase en este caso)
- Maven
- Postman (para pruebas)

---

## ⚙️ Configuración del proyecto

### 1 Clonar el repositorio
```bash
git clone https://github.com/tuusuario/miapp.git
cd miapp
```

### 2 Configuración de la base de datos
Editar el archivo `src/main/resources/application.properties` con tu conexión a PostgreSQL:  

```properties
spring.datasource.url=jdbc:postgresql://<HOST>:5432/<DB_NAME>
spring.datasource.username=<USUARIO>
spring.datasource.password=<PASSWORD>
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8080
```

### 3 Compilar y ejecutar
```bash
mvn clean install
mvn spring-boot:run
```

El servidor correrá en:
```text
http://localhost:8080
```

---

## 📖 Futuras mejoras
- Implementar Spring Security con JWT para autenticación.
- Agregar Swagger para documentar la API.
- Implementar tests unitarios y de integración.

---
