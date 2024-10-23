# Spring Boot REST API - CRUD Operations on Topics

This project demonstrates a simple REST API using Spring Boot for performing CRUD (Create, Read, Update, Delete) operations on `Topic` entities. Each topic consists of three fields: `id`, `name`, and `description`.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setting Up the Project](#setting-up-the-project)
- [API Endpoints](#api-endpoints)
- [Running the Application](#running-the-application)
- [Example Requests](#example-requests)
- [License](#license)

## Prerequisites

Ensure you have the following installed on your system:

- Java 8 or higher
- Maven or Gradle (depending on your preference)
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Technologies Used

- Spring Boot
- Spring Web
- Spring Data JPA (Optional for database integration)
- H2 Database (or any other database)
- Maven/Gradle

## Project Structure

src/
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── demo
│   │               ├── HelloController.java
│   │               ├── SpringDemoApplication.java
│   │               └── topic
│   │                   ├── Topic.java
│   │                   ├── TopicController.java
│   │                   └── TopicService.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── example
                └── demo
                    └── SprignDemoApplicationTests.java
