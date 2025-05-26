# 🔥 CSC-449 Java Projects – Spring 2025 🔥

![Java](https://img.shields.io/badge/Java-21+-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring--Boot-3.4.5-green.svg)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle)
![Build Status](https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/actions/workflows/springboot.yml/badge.svg)

This repository showcases multiple Java projects built with **Spring Boot** and **Gradle** for CSC-449 (Software Engineering) at **National University – Spring 2025**. Each branch represents a separate tutorial, application, or assignment.

---

## 📂 Branch Overview

### 🔸 `main`

- **Purpose**: Root branch for documentation and repository entry point.
- **Contains**: General `README.md`, metadata, and links to working project branches.

---

### 🔧 `demo`

- **Project:** Minimal Spring Boot Starter Project
- **Purpose:** Lightweight base app with a single controller, used for quick testing and prototyping.
- **GitHub Repository:** <https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/tree/demo>
- **Technologies:** Java 21, Spring Boot 3+, Gradle
- **Features:**
  - Basic REST controller returning Hello World!
  - Health endpoint via Spring Actuator
  - Supports testing with HelloControllerTest
- **Run Instructions:**

```bash
git checkout demo
./gradlew bootRun
```

Access via: <http://localhost:8080>

---

### 🌐 `gs-serving-web-content`

- **Project:** Spring Boot Static + Dynamic Web App
- **Based On:** Spring’s Serving Web Content Guide
- **GitHub Repository:** <https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/tree/gs-serving-web-content>
- **Technologies:** Java 21, Spring Boot, Thymeleaf, HTML
- **Features:**
  - Renders dynamic content at `/greeting?name=Brandon`
  - Serves static `index.html` at root `/`
  - Thymeleaf-powered `greeting.html` template
- **Run Instructions:**

  ```bash
  git checkout gs-serving-web-content
  ./gradlew bootRun
    ```

Then open:

- <http://localhost:8080>
- <http://localhost:8080/greeting?name=Brandon>

---

### ☕ `coffeemaker`

- **Project**: Microservice App – Coffee Maker
- **Description**: Spring Boot RESTful API and animated HTML UI that simulates a coffee machine with brewing, water/bean refills, and real-time visual feedback.
- **GitHub Repository**: <https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/tree/coffeemaker>
- **Technologies**: Java 21, Spring Boot 3.4.5, Gradle, HTML/JS
- **Features**:
  - `/brew`, `/refill/water`, `/refill/beans` endpoints
  - Interactive front-end dashboard with animations and a coffee level gauge
  - Fully tested service and controller layers
- **Run Instructions**:

  ```bash
  git checkout coffeemaker
  ./gradlew bootRun
  ```

Visit: <http://localhost:8080>

---

### ☕ `coffeemaker-ci-github`

- **Project**: Coffeemaker - GitHub Actions CI Pipeline
- **Description**: A Java-based Point-of-Sale simulation system that mimics the internal logic of a coffee machine, enhanced with CI/CD integration using **GitHub Actions.**
- **GitHub Repository**: <https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/tree/coffeemaker-ci-github>
- **Technologies**:
  - Java 21
  - Gradle
  - JUnit5
  - GitHub Actions (CI Workflow)
  - Spring-style Service Classes
  - Object-Oriented Design Patters
- **Features**:
  - Role-based transaction and payment handling system
  - Core domain classes: `User`, `Role`, `Transaction`, `Item`, `PaymentMethod`
  - Fully implemented and tested service logic (e.g., `AuthService`, `PaymentService`)
  - GitHub Actions pipeline (`ci.yml`) with test and build automation
  - Test coverage overview (via included screenshots of test results)
- **Run Instructions**:

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025.git
   cd CSC-449-Java-NU-Spring-2025
   git checkout coffeemaker-ci-github
   ```

2. **Run Tests**:

   ```bash
   ./gradlew clean test
   ```

3. **Build the Project**

   ```bash
   ./gradlew build
   ```

4. **Run the Application (Optional)**

   ```bash
   ./gradlew bootRun
   ```

---

### 🧾 `pos-test-ci`

- **Project:** Point-of-Sale (POS) System – GitHub Actions CI/CD Pipeline
- **Description:** A Java-based POS simulation built without Spring Boot to demonstrate CI pipeline integration, test automation, and professional reporting for software engineering documentation.
- **GitHub Repository:** <https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/tree/pos-test-ci>
- **Technologies:**
  - Java 17 (Temurin)
  - Maven
  - JUnit 5
  - Allure Reporting
  - Maven Surefire
  - GitHub Actions

- **Features:**
  - Fully object-oriented POS logic with users, roles, payments, and transactions
  - Unit tests for services (TransactionService, PaymentService)
  - GitHub Actions CI pipeline with:
    - ✅ Java setup
    - ✅ Allure CLI installation
    - ✅ Test execution + HTML report generation
    - ✅ Artifact upload for Allure & Surefire

- **Run Instructions:**

  ```bash
  git clone https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025.git
  cd CSC-449-Java-NU-Spring-2025
  git checkout pos-test-ci
  mvn clean test site allure:report
  ```

Reports:

- **Surefire:** `target/site/surefire-report.html`
- **Allure:** `target/allure-results/index.html`

---

### ✅ Prerequisites

- **Java JDK 21+**
- **Gradle or Gradle Wrapper**
- **VS Code**
- **Internet access for dependency resolution**

---

### 🧪 Testing

All branches include test suites. Run with:

```bash
./gradlew test
```

---

### 🧰 Tools Used

- **Spring Boot**
- **Gradle**
- **Unit 5**
- **Thymeleaf**
- **HTML + JavaScript**

---

### 📚 Educational Purpose

This repo is part of coursework for `CSC-449: Software Engineering, National University, Spring 2025`

---

### 📬 Contact

- **Author:** Brandon Jett
- **Professor:** Dr. Pradip Peter Dey, Ph.D.
