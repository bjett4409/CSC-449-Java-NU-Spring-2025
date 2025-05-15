# ☕ Coffee Maker - Microservice App ☕

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen?logo=springboot)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle)
![Status](https://img.shields.io/badge/Status-Working-success)
![Deploy](https://img.shields.io/badge/Deploy-Live-green?logo=vercel)

This project demonstrates a simple **Spring Boot microservice** simulating a coffee maker. It includes RESTful API endpoints for brewing coffee, refilling water and beans, and a beautiful HTML frontend dashboard with animations and a coffee level gauge.

---

## 🚀 Getting Started

### 📦 1. Generate Project from Spring Initializr

1. Visit [https://start.spring.io/](https://start.spring.io/)
2. Use the following settings:

   * **Project**: Gradle (Groovy)
   * **Language**: Java
   * **Spring Boot**: 3.4.5 (or latest stable)
   * **Group**: `com.example`
   * **Artifact**: `coffeemaker`
   * **Name**: `coffeemaker`
   * **Package Name**: `com.example.coffeemaker`
   * **Packaging**: Jar
   * **Java Version**: 21
   * **Dependencies**: `Spring Web`
3. Click **"Generate"** to download the ZIP.
4. Extract it and open the project in **VS Code**, **IntelliJ**, or your preferred IDE.

---

## 📁 2. Folder Structure

```bash
coffeemaker/
├── .gitattributes
├── .gitignore
├── build.gradle
├── gradlew
├── gradlew.bat
├── HELP.md
├── README.md
├── settings.gradle
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/coffeemaker/
│   │   │       ├── CoffeemakerApplication.java
│   │   │       ├── CoffeeMakerController.java
│   │   │       └── CoffeeMakerService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── templates/
│   │       └── static/
│   │           └── index.html
│   └── test/
│       └── java/
│           └── com/example/coffeemaker/
│               └── CoffeemakerApplicationTests.java
```

## 📄 3. Java Source Code

### ✅ `CoffeemakerApplication.java`

```java
package com.example.coffeemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeemakerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoffeemakerApplication.class, args);
    }
}
```

### ✅ `CoffeeMakerController.java`

```java
package com.example.coffeemaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CoffeeMakerController {

    @Autowired
    private CoffeeMakerService coffeeMakerService;

    @PostMapping("/brew")
    public void brewCoffee() {
        coffeeMakerService.brewCoffee();
    }

    @PostMapping("/refill/water")
    public void refillWater() {
        coffeeMakerService.refillWater();
    }

    @PostMapping("/refill/beans")
    public void refillBeans() {
        coffeeMakerService.refillBeans();
    }

    @GetMapping("/")
    public String status() {
        return "☕ Coffee Maker is online!";
    }
}
```

### ✅ `CoffeeMakerService.java`

```java
package com.example.coffeemaker;

import org.springframework.stereotype.Service;

@Service
public class CoffeeMakerService {

    public void brewCoffee() {
        System.out.println("Brewing coffee...");
    }

    public void refillWater() {
        System.out.println("Refilling water reservoir...");
    }

    public void refillBeans() {
        System.out.println("Refilling coffee beans...");
    }
}
```

---

## 🌐 4. Frontend HTML Interface

File: `src/main/resources/static/index.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>☕ Coffee Maker Control Panel</title>
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      text-align: center;
      background: #f4f4f4;
      padding-top: 50px;
    }

    h1 {
      color: #5e3c00;
    }

    button {
      padding: 12px 24px;
      margin: 10px;
      font-size: 16px;
      border: none;
      background-color: #6f4e37;
      color: white;
      border-radius: 8px;
      transition: transform 0.2s, background-color 0.3s;
      cursor: pointer;
    }

    button:hover {
      transform: scale(1.05);
      background-color: #563926;
    }

    #log {
      margin-top: 30px;
      font-weight: bold;
      color: #2b2b2b;
    }

    .gauge-container {
      width: 300px;
      margin: 30px auto;
      background-color: #ddd;
      border-radius: 20px;
      overflow: hidden;
    }

    .gauge-fill {
      height: 30px;
      width: 80%; /* initial fill level */
      background-color: #4caf50;
      transition: width 0.6s ease-in-out;
    }

    .brew-animation {
      font-size: 24px;
      margin-top: 20px;
      animation: bounce 0.6s infinite alternate;
    }

    @keyframes bounce {
      0% { transform: translateY(0); }
      100% { transform: translateY(-10px); }
    }
  </style>
</head>
<body>
  <h1>☕ Coffee Maker Control Panel</h1>

  <button onclick="brewCoffee()">Brew Coffee</button>
  <button onclick="refillWater()">Refill Water</button>
  <button onclick="refillBeans()">Refill Beans</button>

  <div class="gauge-container">
    <div class="gauge-fill" id="coffeeGauge"></div>
  </div>

  <div id="animation" class="brew-animation" style="display: none;">Brewing...</div>
  <div id="log">Ready.</div>

  <script>
    let coffeeLevel = 80; // Initial coffee level (0–100)

    function updateLog(message) {
      document.getElementById("log").innerText = message;
    }

    function updateGauge() {
      const gauge = document.getElementById("coffeeGauge");
      gauge.style.width = coffeeLevel + "%";
      if (coffeeLevel <= 20) {
        gauge.style.backgroundColor = "#ff5722"; // red
      } else if (coffeeLevel <= 50) {
        gauge.style.backgroundColor = "#ffc107"; // yellow
      } else {
        gauge.style.backgroundColor = "#4caf50"; // green
      }
    }

    function brewCoffee() {
      document.getElementById("animation").style.display = "block";
      fetch('/brew', { method: 'POST' })
        .then(() => {
          coffeeLevel = Math.max(coffeeLevel - 20, 0);
          updateGauge();
          updateLog("Brewing coffee...");
        })
        .catch(() => updateLog("Failed to brew coffee."))
        .finally(() => {
          setTimeout(() => {
            document.getElementById("animation").style.display = "none";
          }, 2000);
        });
    }

    function refillWater() {
      fetch('/refill/water', { method: 'POST' })
        .then(() => {
          updateLog("Refilling water...");
        })
        .catch(() => updateLog("Failed to refill water."));
    }

    function refillBeans() {
      fetch('/refill/beans', { method: 'POST' })
        .then(() => {
          coffeeLevel = 100;
          updateGauge();
          updateLog("Refilling beans...");
        })
        .catch(() => updateLog("Failed to refill beans."));
    }

    // Initialize
    updateGauge();
  </script>
</body>
</html>
```

---

## 🛠️ 5. Configuration Files

### ✅ `application.properties`

```properties
spring.application.name=coffeemaker
```

### ✅ `build.gradle`

```groovy
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.4.5'
    id 'io.spring.dependency-management' version '1.1.7'
    id 'application'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

application {
    mainClass = 'com.example.coffeemaker.CoffeemakerApplication'
}

tasks.named('test') {
    useJUnitPlatform()
}
```

---

## ▶️ 6. Run and Test the App

In the terminal:

```bash
./gradlew bootRun
```

Then open your browser:

```groovy
http://localhost:8080/
```

📅 Click the buttons to brew coffee, refill water, or refill beans. The gauge and animations will respond in real time.

![frontend.jpg](/Screenshots/frontend.jpg)

---

## ✅ Proof of Work

* Demonstrates REST API development using Spring Boot
* Shows frontend-backend interaction using vanilla HTML + JS
* Features animations, state changes, and feedback loop
