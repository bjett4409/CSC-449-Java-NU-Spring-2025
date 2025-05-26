# Getting Started – POS Test & Report Project

This project is part of the `CSC-449 - Software Engineering` course. It showcases test automation and CI integration for a Java-based Point-of-Sale system using Maven, GitHub Actions, and reporting frameworks.

---

## 🛠️ Tools & Technologies

- Java 21
- Maven 3.x
- JUnit 5 (Jupiter)
- Maven Surefire Plugin
- Allure Reporting
- GitHub Actions

---

## 📦 Build and Test the Project

1. **Clone the Repository**

    ```bash
    git clone https://github.com/bjett4409/CSC-449-Java-NU-Spring-2025.git
    cd CSC-449-Java-NU-Spring-2025
    git checkout pos-test-ci
    ```

1. **Run Tests and Generate Reports**

    ```bash
    mvn clean test site allure:report
    ```

1. **View Reports**

- Surefire: `target/site/surefire-report.html`
- Allure: `target/allure-results/index.html`

---

## 📚 Reference Links

- [Maven Official Documentation](https://maven.apache.org/guides/index.html)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Allure Report Docs](https://docs.qameta.io/allure/)
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Surefire Plugin Usage](https://maven.apache.org/surefire/maven-surefire-plugin/)

---

## 📌 Tips for Success

- Ensure Java 17 and Maven are installed and in your system's `PATH`.
- Use `mvn clean` frequently to avoid stale builds.
- Run `mvn dependency:tree` to verify test dependencies.
- Use GitHub Actions logs to trace and debug failed test steps.

---

This project is intended for academic use and demonstrates CI/CD best practices using open-source tooling. For questions, refer to the project `README.md` or contact the project maintainer.
