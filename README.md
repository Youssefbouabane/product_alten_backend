# Product API - Spring Boot Application

## Project Overview

This Spring Boot application is built to manage a product catalog with CRUD operations using RESTful APIs. The APIs allow you to create, retrieve, update, and delete products, as well as fetch the details of specific products. 

## Features

- Create a new product
- Retrieve all products
- Retrieve details of a specific product by ID
- Update product details
- Delete a product by ID

## Database

The project uses **H2** as an in-memory database for testing purposes.

### H2 Database Details:
- **URL**: `jdbc:h2:mem:testdb`
- **Driver Class**: `org.h2.Driver`
- **Username**: `sa`
- **Password**: (No password is required)

You can access the H2 console from the following URL after running the application:
http://localhost:8080/h2-console


- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: (Leave it blank)

## Postman Collection

For easier testing of the APIs, a **Postman collection** is provided in the project root directory. The file is named `product_alten.collection.json`.

### Steps to use the Postman collection:

1. Open **Postman**.
2. Import the collection by clicking on `Import` and selecting the file `product_alten.collection.json` from the project directory.
3. Once imported, you can run the pre-configured API requests to test the Product APIs.

## Running the Project

To run the project, follow these steps:

1. Clone the repository.
2. Make sure you have **Java 8 or later** installed.
3. Navigate to the project directory and use the following command to run the application:
   ```bash
   ./mvnw spring-boot:run


