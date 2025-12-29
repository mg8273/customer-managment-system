# Customer Management System (CRUD)

A full-stack web application developed using **Java Spring Boot** for the backend and **Vanilla JavaScript** for the frontend. This project demonstrates core OOPJ concepts and RESTful API implementation for the CS301P Lab ESE.

## 🚀 Features
- **Create**: Add new customers with their name and address.
- **Read**: View a real-time list of all registered customers.
- **Update**: Modify existing customer details via ID.
- **Delete**: Remove customer records from the database.

## 🛠️ Tech Stack
- **Backend**: Java 17+, Spring Boot 3.x, Spring Data JPA
- **Database**: H2 (In-Memory Database)
- **Frontend**: HTML5, CSS3, JavaScript (Fetch API)
- **Build Tool**: Maven
- **Tooling**: VS Code / IntelliJ IDEA

## 🏗️ Project Architecture
The project follows a **Layered Architecture** to ensure modularity and separation of concerns:
1. **Model (Entity)**: `Customer.java` - Defines the data structure.
2. **Repository**: `CustomerRepository.java` - Handles database abstraction.
3. **Controller**: `CustomerController.java` - Exposes REST endpoints.

## 🌐 API Endpoints
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| GET | `/api/customers` | Fetch all customers |
| POST | `/api/customers` | Create a new customer |
| PUT | `/api/customers/{id}` | Update customer by ID |
| DELETE | `/api/customers/{id}` | Delete customer by ID |

## 📝 Core OOP Concepts Implemented
- **Encapsulation**: Used private fields with Lombok-generated getters/setters.
- **Inheritance**: `CustomerRepository` extends `JpaRepository`.
- **Abstraction**: Hiding DB complexity via the JPA layer.
- **Polymorphism**: Method overriding for REST controller mappings.

## ⚙️ How to Run
1. Clone the repository:
   ```bash
   git clone <your-repository-link>
