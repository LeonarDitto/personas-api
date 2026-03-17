
# Personas API

API REST para gestión de personas con operaciones CRUD.

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Ejecutar proyecto

1. Clonar repositorio

2. Crear base de datos

CREATE DATABASE personasdb;

3. Configurar usuario y contraseña en:

src/main/resources/application.properties

4. Ejecutar

mvn spring-boot:run

## Endpoints

POST /api/personas  
GET /api/personas  
GET /api/personas/{id}  
PUT /api/personas/{id}  
DELETE /api/personas/{id}

## Ejemplo Request

POST /api/personas

{
 "nombre":"Juan",
 "apellidoPaterno":"Perez",
 "correo":"juan@email.com",
 "edad":30
}