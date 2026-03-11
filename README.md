# Task Manager API

A Spring Boot REST API for managing tasks.

## Features
- CRUD operations for tasks
- Pagination support
- DTO pattern
- Global exception handling
- Swagger API documentation
- H2 in-memory database

## Technologies
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Swagger (OpenAPI)

## API Endpoints

GET /tasks
POST /tasks
PUT /tasks/{id}
DELETE /tasks/{id}

## Run the project

mvn spring-boot:run

Swagger UI:
http://localhost:8080/swagger-ui/index.html
