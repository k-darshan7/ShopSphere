# ShopSphere Backend API

This is a comprehensive ShopSphere Backend API built using **Spring Boot**, **MongoDB**, and **JWT Authentication**. It includes essential features for managing products, orders, and user authentication with Docker support for easy deployment.

## 🚀 Features
- ✅ **JWT Authentication** for secure user login and session management
- ✅ **Product Management** with CRUD functionality
- ✅ **Order Management** for customer purchases
- ✅ **Payment Integration (Simulated)** for order processing
- ✅ **MongoDB** as the database
- ✅ **Swagger Documentation** for easy API testing
- ✅ **Docker Support** for simplified deployment
- ✅ **Unit Tests** using JUnit and Mockito

---

## 📂 Project Structure
```
src
 └── main
     └── java/com/shopping/ecommerce
         ├── config        # Security & Configuration
         ├── controller    # REST API Controllers
         ├── model         # MongoDB Schemas (e.g., User, Product)
         ├── repository    # MongoDB Repositories
         ├── service       # Business Logic Services
         ├── utils         # Utility Classes (e.g., JWT Utils)
         └── ShopSphereApplication.java  # Main Entry Point
 └── resources
     └── application.properties  # MongoDB Configuration
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/k-darshan7/ShopSphere.git
cd shopsphere-backend
```

### 2️⃣ Build the Project
```bash
mvn clean install
```

### 3️⃣ Run the Project Using Docker
Ensure Docker is running on your system, then execute:
```bash
docker-compose up
```

### 4️⃣ Access the API
- **Base URL:** `http://localhost:8080`
- **Swagger Documentation:** [Swagger UI](http://localhost:8080/swagger-ui.html)

---

## 🔑 Authentication Endpoints
| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| `POST` | `/auth/register` | Register a new user  |
| `POST` | `/auth/login`    | Login and obtain JWT |

## 🛒 Product Management Endpoints
| Method | Endpoint            | Description             |
|---------|--------------------|--------------------------|
| `GET`    | `/products`         | List all products        |
| `GET`    | `/products/{id}`    | Get product by ID        |
| `POST`   | `/products`         | Add a new product         |
| `PUT`    | `/products/{id}`    | Update product details    |
| `DELETE` | `/products/{id}`    | Delete a product          |

---

## 🧪 Running Tests
To run the unit tests:
```bash
mvn test
```

---

## 📜 Environment Variables
Add the following variables in your `.env` file or `application.properties` if needed:
```properties
server.port=8080
spring.data.mongodb.uri=mongodb://localhost:27017/ecommerce
spring.data.mongodb.database=ecommerce
```

---

## 🤝 Contributing
Contributions are welcome! If you have suggestions for improvements, feel free to submit a pull request.

---

## 📄 License
This project is licensed under the **MIT License**.

---

## 📧 Contact
For any questions or support, please reach out via GitHub Issues or email.
