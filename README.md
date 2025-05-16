# 🚀 Spring Boot Project Guide

---

![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)
![Spring Boot](https://img.shields.io/badge/spring--boot-3.0%2B-blue.svg)
![Java](https://img.shields.io/badge/java-21%2B-orange.svg)
![Code Coverage](https://img.shields.io/badge/coverage-100%25-brightgreen.svg)
![Platform](https://img.shields.io/badge/platform-%20VSCode-blueviolet.svg)
![Status](https://img.shields.io/badge/status-active-success.svg)

This README outlines how to get started with a basic Spring Boot project using both Java and Groovy, following the [official Spring Boot guide](https://spring.io/guides/gs/spring-boot). You'll learn how to clone the project, run it locally, and verify endpoints.

---

## 📁 Project Setup

### 🔹 Clone and Open in VS Code

```bash
git clone https://github.com/spring-guides/gs-spring-boot.git
cd gs-spring-boot/complete
code .
```

> Use the `initial` directory instead of `complete` to start from scratch.

---

## 🧰 Prerequisites

Make sure you have the following installed:

* Java JDK 17 or later
* Gradle (or use included Gradle wrapper)
* Internet access for dependency resolution

---

## 📁 Project Folder Structure

```bash
├── .gradle/
├── .vscode/
├── bin/
│   └── main/
│       ├── com/
│       ├── templates/
│       └── application.properties
│   └── test/
│       └── com/example/
│           ├── demo/
│           │   └── DemoApplicationTests.class
│           └── springboot/
│               └── HelloControllerTest.class
├── build/
├── gradle/
├── Screenshots/
├── src/
│   └── main/
│       ├── java/com/example/
│       │   ├── demo/
│       │   │   └── DemoApplication.java
│       │   └── springboot/
│       │       └── HelloController.java
│       └── resources/
│           ├── static/
│           ├── templates/
│           └── application.properties
│
│   └── test/
│       └── java/com/example/
│           ├── demo/
│           │   └── DemoApplicationTests.java
│           └── springboot/
│               └── HelloControllerTest.java
│
├── .gitattributes
├── .gitignore
├── build.gradle
├── gradlew
├── gradlew.bat
├── HELP.md
├── README.md
├── settings.gradle
```

---

## ⚙️ Running the Application

### 🔹 Start the App with Gradle

```bash
./gradlew bootRun
```

### 🔹 Run Unit Tests

```bash
./gradlew test
```

> On Windows, use `gradlew.bat` instead of `./gradlew`

---

## ☕ Java Version - `Application.java`

```java
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
}
```

---

## 🍵 Java Version - `Application.java`

```java
package hello

@Grab('spring-boot-starter-web')
@RestController
class Application {

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }
}
```

---

## ☕ Java Version - `HelloControllerITest.java`

```java
package com.example.springboot;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerITest {

 @Autowired
 private TestRestTemplate template;

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    }
}
```

---

## 🍵 Java Version - `HelloControllerTest.java`

```java
package com.example.springboot;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

 @Autowired
 private MockMvc mvc;

 @Test
 public void getHello() throws Exception {
  mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
    .andExpect(status().isOk())
    .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
 }
}
```

---

## 📂 Project Build Files

### 🔸 `build.gradle`

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
 implementation 'org.springframework.boot:spring-boot-starter-actuator'

 testImplementation 'org.springframework.boot:spring-boot-starter-test'
 testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

application {
 mainClass = 'com.example.springboot.Application'
}

tasks.named('test') {
 useJUnitPlatform()
}
```

### 🔸 `settings.gradle`

```groovy
rootProject.name = 'demo'
```

---

## 📸 Screenshots (Insert Below)

### 🔹 Health Check Endpoint

### 🔹 Home Page

* URL: `http://localhost:8080/`
![Spring Boot.jpg](Screenshots/Spring%20Boot.jpg)
* Expected Output: `/` returns: `Greetings from Spring Boot!`

* URL: `http://localhost:8080/actuator/health`
![Actuator Health.jpg](Screenshots/Actuator%20Health.jpg)
* Expected Output: `/actuator/health` returns: `{"status":"UP"}`

---

## 🧪 Testing the Service

Once the server is running, test with:

```bash
curl http://localhost:8080/
curl http://localhost:8080/actuator/health
```

---

## ✅ You're Ready

You've successfully created and tested a basic Spring Boot application. Continue to customize the REST controller or integrate Spring features like JPA, Security, or Thymeleaf as needed.
