# File Upload Service with JWT Authentication

This project is a part of the TechEazy `12may-batch4` assignment. It is a Spring Boot application that allows authenticated users to upload images, with metadata stored in PostgreSQL and files stored on the local filesystem.

---

## ✅ Features

- ✅ Register and login with JWT-based authentication
- ✅ Upload images with associated metadata (user, timestamp)
- ✅ Files are stored locally on the server
- ✅ Secure endpoints with JWT token verification
- ✅ PostgreSQL integration for storing user and picture metadata
- ✅ Layered architecture (Controller, Service, Repository)

---

## 📦 Technologies Used

- Java 17
- Spring Boot
- Spring Security + JWT
- PostgreSQL
- Maven
- Lombok

---

## 🚀 Getting Started

### 🔧 Prerequisites

- Java 17+
- Maven
- PostgreSQL
- Postman (for testing)

### ⚙️ Setup Instructions

1. **Create the PostgreSQL database**:
   ```sql
   CREATE DATABASE fileupload;
