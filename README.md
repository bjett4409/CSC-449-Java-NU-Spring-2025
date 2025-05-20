# 🔥 CSC-449 Java Projects – Spring 2025 🔥

![Java](https://img.shields.io/badge/Java-21+-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring--Boot-3.4.5-green.svg)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle)
![Build Status](https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025/actions/workflows/springboot.yml/badge.svg)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

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

**GitHub:** Brandon Jett
