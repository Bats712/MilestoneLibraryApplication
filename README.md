# Milestone Library Application

## Overview

Milestone Library Application is a Spring Boot REST API designed to manage a library system. It provides CRUD (Create, Read, Update, Delete) operations for managing books and related data in a structured and efficient way. The application leverages Spring Data JPA for database interactions and follows RESTful best practices.

## Features

* Add, update, delete, and view books.
* Uses Spring Data JPA for database management.
* RESTful endpoints for seamless integration with a frontend or external clients.
* Easily extendable for authors, members, or borrowing records.

## Technologies Used

* **Java 17+**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **H2 / MySQL** (depending on configuration)
* **Lombok**
* **Maven**

## Project Structure

```
src/
 ├─ main/
 │   ├─ java/com/champsoft/milestonelibraryapplication/
 │   │   ├─ controller/        # REST Controllers
 │   │   ├─ datalayer/         # Entities and Repositories
 │   │   ├─ service/           # Business Logic (if applicable)
 │   │   └─ MilestoneLibraryApplication.java  # Main Application
 │   └─ resources/
 │       ├─ application.properties
 │       └─ data.sql / schema.sql (optional)
 └─ test/
     └─ java/...               # Unit and Integration Tests
```

## How to Run

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/MilestoneLibraryAppFinito.git
   cd MilestoneLibraryAppFinito
   ```

2. **Build the project**

   ```bash
   mvn clean install
   ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

   or run `MilestoneLibraryApplication.java` from your IDE.

4. **Access the API**
   The application runs on:

   ```
   http://localhost:8080
   ```

## Example Endpoints

| Method | Endpoint    | Description         |
| ------ | ----------- | ------------------- |
| GET    | /books      | Get all books       |
| GET    | /books/{id} | Get book by ID      |
| POST   | /books      | Add new book        |
| PUT    | /books/{id} | Update book details |
| DELETE | /books/{id} | Delete a book       |

## License

This project is for educational purposes and can be freely modified or extended.
