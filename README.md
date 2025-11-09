# 🛒 Flipkart Automation Testing

[![Java](https://img.shields.io/badge/Java-11-orange.svg)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.23.0-green.svg)](https://www.selenium.dev/)
[![Cucumber](https://img.shields.io/badge/Cucumber-7.20.1-brightgreen.svg)](https://cucumber.io/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![TestNG](https://img.shields.io/badge/TestNG-7.10.2-red.svg)](https://testng.org/)

A comprehensive **End-to-End (E2E) Test Automation Framework** for Flipkart e-commerce platform using **Selenium WebDriver**, **Cucumber BDD**, and **Java**. This project follows industry best practices including Page Object Model (POM), Behavior-Driven Development (BDD), and robust reporting mechanisms.

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Purpose](#-purpose)
- [Tech Stack](#-tech-stack)
- [Features](#-features)
- [Project Architecture](#-project-architecture)
- [Prerequisites](#-prerequisites)
- [Setup Instructions](#-setup-instructions)
- [Usage Instructions](#-usage-instructions)
- [Test Data & Configuration](#-test-data--configuration)
- [Reporting](#-reporting)
- [Project Structure](#-project-structure)
- [CI/CD Integration](#-cicd-integration)
- [Contributing](#-contributing)
- [License](#-license)
- [Future Enhancements](#-future-enhancements)

---

## 🎯 Overview

**Flipkart Automation Testing** is a robust test automation framework designed to validate critical user journeys on the Flipkart e-commerce platform. The framework is built with scalability, maintainability, and reliability in mind, making it suitable for continuous integration and continuous deployment (CI/CD) pipelines.

### Key Highlights

- ✅ **BDD Approach**: Tests written in Gherkin syntax for better collaboration
- ✅ **Page Object Model**: Maintainable and reusable page objects
- ✅ **Multi-Browser Support**: Chrome and Firefox support via WebDriverManager
- ✅ **Comprehensive Reporting**: Multiple reporting options (Cucumber HTML, Extent Reports, Allure)
- ✅ **Data-Driven Testing**: Excel-based test data support (Apache POI)
- ✅ **API Testing Ready**: Rest Assured integration for API validation
- ✅ **Mobile Testing Ready**: Appium integration for mobile automation

---

## 🎯 Purpose

### Why This Project?

This automation framework was developed to:

1. **Ensure Quality**: Automate regression testing to catch bugs early in the development cycle
2. **Save Time**: Reduce manual testing effort and enable faster releases
3. **Increase Coverage**: Execute test cases across multiple browsers and environments
4. **Improve Collaboration**: BDD approach allows non-technical stakeholders to understand test scenarios
5. **Enable CI/CD**: Integrate seamlessly with CI/CD pipelines for automated test execution

### Target Audience

- **QA Engineers**: For maintaining and extending test automation
- **Developers**: For understanding test scenarios and fixing bugs
- **Product Managers**: For reviewing test coverage and business scenarios
- **DevOps Engineers**: For CI/CD integration and pipeline setup

---

## 🛠 Tech Stack

### Core Technologies

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 11 | Programming language |
| **Selenium WebDriver** | 4.23.0 | Web automation |
| **Cucumber** | 7.20.1 | BDD framework |
| **TestNG** | 7.10.2 | Test execution and parallelization |
| **Maven** | 3.6+ | Dependency management and build tool |

### Supporting Libraries

| Library | Version | Purpose |
|---------|---------|---------|
| **WebDriverManager** | 5.9.2 | Automatic browser driver management |
| **Extent Reports** | 5.1.2 | Advanced HTML reporting |
| **Allure** | 2.29.0 | Beautiful test reporting |
| **Apache POI** | 5.3.0 | Excel file handling for test data |
| **Rest Assured** | 5.5.0 | API testing capabilities |
| **Appium** | 9.3.0 | Mobile automation support |
| **AspectJ** | 1.9.22.1 | AOP for hooks and reporting |
| **Gson** | 2.11.0 | JSON parsing |
| **SLF4J** | 2.0.13 | Logging framework |

### Tools & IDE

- **IDE**: IntelliJ IDEA / Eclipse / VS Code
- **Version Control**: Git
- **CI/CD**: GitHub Actions (ready for integration)
- **Browser Drivers**: Managed automatically via WebDriverManager

---

## ✨ Features

### Current Features

1. **🔍 Search Functionality Testing**
   - Product search validation
   - Search results verification
   - Home page navigation

2. **🏠 Home Page Automation**
   - Application launch
   - Login popup handling
   - Page navigation validation

3. **📊 Multiple Reporting Options**
   - Cucumber HTML Reports
   - Extent Reports
   - Allure Reports (configured)

4. **🔄 Reusable Components**
   - Selenium reusable functions
   - Base class for common operations
   - Utility classes for Excel and configuration

5. **⚙️ Configuration Management**
   - Properties file-based configuration
   - Browser selection (Chrome/Firefox)
   - URL management

### Planned Features

- ✅ User login/logout automation
- ✅ Product detail page validation
- ✅ Add to cart functionality
- ✅ Checkout flow automation
- ✅ Order tracking
- ✅ Wishlist management
- ✅ Filter and sort operations
- ✅ Payment gateway testing (sandbox)
- ✅ Cross-browser testing (Safari, Edge)
- ✅ Parallel test execution
- ✅ Screenshot on failure
- ✅ Video recording of test execution

---

## 🏗 Project Architecture

### Design Patterns

1. **Page Object Model (POM)**
   - Separates page logic from test logic
   - Improves maintainability and reusability

2. **Behavior-Driven Development (BDD)**
   - Gherkin syntax for test scenarios
   - Step definitions for implementation

3. **Factory Pattern**
   - WebDriver initialization
   - Browser selection logic

4. **Singleton Pattern**
   - Base class for driver management

### Architecture Layers

```
┌─────────────────────────────────────┐
│   Feature Files (Gherkin)          │
│   SearchFunctionality.feature      │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│   Step Definitions                   │
│   SearchFunctionality_Testcase.java  │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│   Page Objects                       │
│   SearchPage.java                    │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│   Base Classes & Utilities           │
│   Library.java, SeleniumReusable.java│
└─────────────────────────────────────┘
```

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

### Required Software

1. **Java Development Kit (JDK)**
   - Version: **JDK 11 or higher**
   - Download: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
   - Verify: `java -version`

2. **Maven**
   - Version: **3.6.0 or higher**
   - Download: [Maven Download](https://maven.apache.org/download.cgi)
   - Verify: `mvn -version`

3. **Git**
   - Download: [Git Download](https://git-scm.com/downloads)
   - Verify: `git --version`

4. **IDE (Optional but Recommended)**
   - IntelliJ IDEA (Community/Ultimate)
   - Eclipse IDE
   - VS Code with Java extensions

### Browser Requirements

- **Google Chrome** (latest version) - Recommended
- **Mozilla Firefox** (latest version) - Optional
- Browser drivers are managed automatically by WebDriverManager

---

## 🚀 Setup Instructions

### Step 1: Clone the Repository

```bash
git clone https://github.com/your-username/flipkart_Automation_Testing.git
cd flipkart_Automation_Testing
```

### Step 2: Verify Java and Maven Installation

```bash
# Check Java version
java -version

# Check Maven version
mvn -version
```

### Step 3: Install Dependencies

Maven will automatically download all dependencies defined in `pom.xml`:

```bash
mvn clean install
```

Or if you want to skip tests during installation:

```bash
mvn clean install -DskipTests
```

### Step 4: Configure Environment

1. **Update Configuration File**

   Edit `src/test/resources/Properities/Config.properties`:

   ```properties
   browser=chrome
   url=https://www.flipkart.com/
   ```

   **Available Browser Options:**
   - `chrome` - Google Chrome (default)
   - `firefox` - Mozilla Firefox

2. **Environment Variables (Optional)**

   If you need to override configuration via environment variables:

   ```bash
   export BROWSER=chrome
   export FLIPKART_URL=https://www.flipkart.com/
   ```

### Step 5: Verify Setup

Run a quick test to verify everything is working:

```bash
mvn test
```

---

## 💻 Usage Instructions

### Running Tests

#### 1. Run All Tests

```bash
mvn test
```

#### 2. Run Specific Feature File

```bash
mvn test -Dcucumber.filter.tags="@SearchFunctionality"
```

#### 3. Run Tests via TestNG Runner

```bash
mvn test -Dtest=RunnerTest
```

#### 4. Run Tests with Specific Browser

Update `Config.properties` or use Maven properties:

```bash
mvn test -Dbrowser=firefox
```

#### 5. Run Tests in Parallel (Future Enhancement)

```bash
mvn test -Dparallel=true
```

### Running from IDE

#### IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/test/java/com/TestRunner/RunnerTest.java`
3. Right-click on `RunnerTest` class
4. Select **Run 'RunnerTest'**

#### Eclipse

1. Import the project as Maven project
2. Right-click on `RunnerTest.java`
3. Select **Run As** → **JUnit Test**

### Maven Commands Reference

| Command | Description |
|---------|-------------|
| `mvn clean` | Clean target directory |
| `mvn compile` | Compile source code |
| `mvn test` | Run all tests |
| `mvn test -Dtest=RunnerTest` | Run specific test class |
| `mvn clean install` | Clean, compile, test, and package |
| `mvn clean install -DskipTests` | Build without running tests |

---

## 📊 Test Data & Configuration

### Configuration File

**Location**: `src/test/resources/Properities/Config.properties`

```properties
# Browser Configuration
browser=chrome

# Application URL
url=https://www.flipkart.com/

# Timeout Settings (can be added)
# implicit.wait=20
# explicit.wait=10
# page.load.timeout=30
```

### Test Data Management

#### Excel-Based Test Data (Future Enhancement)

The framework includes `ExcelUtility.java` for reading test data from Excel files:

- **Location**: `src/main/java/com/Utilities/ExcelUtility.java`
- **Format**: `.xlsx` files
- **Library**: Apache POI 5.3.0

#### Feature File Test Data

Currently, test data is embedded in feature files:

```gherkin
Feature: Validate Flipkart Application
  Scenario: Validate the search functionality
    Given User enters the text in the Search field
    # Search text: "Mobile" (hardcoded in step definition)
```

### Environment-Specific Configuration

Create environment-specific property files:

- `Config-dev.properties` - Development environment
- `Config-staging.properties` - Staging environment
- `Config-prod.properties` - Production environment

---

## 📈 Reporting

The framework supports multiple reporting mechanisms:

### 1. Cucumber HTML Reports

**Location**: `target/cucumber-html-report/index.html`

**View Report**:
```bash
# After test execution
open target/cucumber-html-report/index.html
```

**Features**:
- Feature-wise test results
- Step-by-step execution details
- Scenario status (Pass/Fail)
- Execution time

### 2. Extent Reports

**Configuration**: Already integrated via `extentreports-cucumber7-adapter`

**Location**: `target/extent-reports/ExtentReport.html` (default)

**Features**:
- Beautiful HTML reports
- Screenshots on failure
- Test execution timeline
- Pie charts and graphs

### 3. Allure Reports

**Generate Report**:
```bash
# Run tests with Allure
mvn clean test

# Generate Allure report
mvn allure:report

# Serve Allure report
mvn allure:serve
```

**Features**:
- Interactive dashboard
- Historical trends
- Test categories
- Attachments (screenshots, logs)

### 4. Console Output

Real-time test execution logs are displayed in the console with:
- ✅ Pass indicators
- ❌ Fail indicators
- Step-by-step execution details

---

## 📁 Project Structure

```
flipkart_Automation_Testing/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           ├── Baseclass/
│   │           │   └── Library.java              # Base class for WebDriver initialization
│   │           ├── Hooks/
│   │           │   └── hooks.java                 # Cucumber hooks (Before/After)
│   │           ├── ReusableFunctions/
│   │           │   └── SeleniumReusable.java     # Reusable Selenium functions
│   │           └── Utilities/
│   │               └── ExcelUtility.java          # Excel file operations
│   │
│   └── test/
│       ├── java/
│       │   └── com/
│       │       ├── Pages/
│       │       │   └── SearchPage.java            # Page Object for Search functionality
│       │       ├── Stepdefenitions/
│       │       │   └── SearchFunctionality_Testcase.java  # Step definitions
│       │       └── TestRunner/
│       │           └── RunnerTest.java            # TestNG/Cucumber runner
│       │
│       └── resources/
│           ├── Features/
│           │   └── SearchFunctionality.feature   # BDD feature file
│           └── Properities/
│               └── Config.properties              # Configuration file
│
├── target/                                        # Build output directory
│   ├── classes/                                   # Compiled classes
│   ├── test-classes/                              # Compiled test classes
│   └── cucumber-html-report/                      # Cucumber HTML reports
│
├── pom.xml                                        # Maven configuration
└── README.md                                      # Project documentation
```

### Directory Explanation

| Directory | Purpose |
|-----------|---------|
| `src/main/java/com/Baseclass/` | Base classes for WebDriver and common operations |
| `src/main/java/com/Hooks/` | Cucumber hooks for setup/teardown |
| `src/main/java/com/ReusableFunctions/` | Reusable Selenium wrapper methods |
| `src/main/java/com/Utilities/` | Utility classes (Excel, JSON, etc.) |
| `src/test/java/com/Pages/` | Page Object Model classes |
| `src/test/java/com/Stepdefenitions/` | Cucumber step definitions |
| `src/test/java/com/TestRunner/` | Test execution runners |
| `src/test/resources/Features/` | Gherkin feature files |
| `src/test/resources/Properities/` | Configuration properties |

---

## 🔄 CI/CD Integration

### GitHub Actions (Ready for Integration)

Create `.github/workflows/ci.yml`:

```yaml
name: Flipkart Automation Tests

on:
  push:
    branches: [ main, develop ]
  pull_request:
    branches: [ main ]

jobs:
  test:
    runs-on: ubuntu-latest
    
    steps:
    - uses: actions/checkout@v3
    
    - name: Set up JDK 11
      uses: actions/setup-java@v3
      with:
        java-version: '11'
        distribution: 'temurin'
    
    - name: Cache Maven dependencies
      uses: actions/cache@v3
      with:
        path: ~/.m2
        key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
    
    - name: Install dependencies
      run: mvn clean install -DskipTests
    
    - name: Run tests
      run: mvn test
    
    - name: Generate Allure Report
      run: mvn allure:report
    
    - name: Upload Allure Report
      uses: actions/upload-artifact@v3
      with:
        name: allure-report
        path: target/site/allure-maven-plugin
```

### Jenkins Integration

1. Create a new Jenkins job
2. Configure Git repository
3. Add build step: `mvn clean test`
4. Add post-build action: Publish test results
5. Configure Allure/Extent Reports plugin

---

## 🤝 Contributing

We welcome contributions! Please follow these guidelines:

### Contribution Guidelines

1. **Fork the Repository**
   ```bash
   git clone https://github.com/your-username/flipkart_Automation_Testing.git
   ```

2. **Create a Feature Branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Follow Coding Standards**
   - Use meaningful variable and method names
   - Add comments for complex logic
   - Follow Java naming conventions
   - Write clear Gherkin scenarios

4. **Write Tests**
   - Add feature files in `src/test/resources/Features/`
   - Implement step definitions
   - Create page objects if needed

5. **Commit Changes**
   ```bash
   git add .
   git commit -m "Add: Description of your changes"
   ```

6. **Push and Create Pull Request**
   ```bash
   git push origin feature/your-feature-name
   ```

### Code Review Process

- All pull requests require at least one approval
- Ensure all tests pass before submitting PR
- Update documentation if needed
- Follow the existing code structure

### Reporting Issues

Use GitHub Issues to report bugs or suggest features:
- Provide clear description
- Include steps to reproduce
- Add screenshots if applicable
- Mention environment details

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 Flipkart Automation Testing

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```


## 🚀 Future Enhancements

### Short-term Goals (Next 3 Months)

- [ ] **Enhanced Test Coverage**
  - User login/logout automation
  - Product detail page validation
  - Add to cart functionality
  - Checkout flow automation

- [ ] **Reporting Improvements**
  - Screenshot on test failure
  - Video recording of test execution
  - Email notifications on test completion

- [ ] **Configuration Enhancements**
  - Environment-specific configurations
  - Database integration for test data
  - JSON-based test data support

### Medium-term Goals (3-6 Months)

- [ ] **Performance Testing**
  - Page load time validation
  - API response time checks
  - Performance benchmarking

- [ ] **API Testing**
  - REST API validation using Rest Assured
  - API response verification
  - Integration with UI tests

- [ ] **Mobile Testing**
  - Appium integration for mobile app testing
  - Cross-platform mobile validation

- [ ] **Parallel Execution**
  - TestNG parallel execution
  - Grid setup for distributed testing
  - Cloud testing (BrowserStack/Sauce Labs)

### Long-term Goals (6+ Months)

- [ ] **AI/ML Integration**
  - Self-healing test automation
  - Intelligent element identification
  - Test case optimization

- [ ] **Advanced Reporting**
  - Real-time dashboard
  - Test analytics and insights
  - Historical trend analysis

- [ ] **CI/CD Pipeline**
  - Full GitHub Actions integration
  - Automated deployment triggers
  - Slack/Teams notifications

- [ ] **Documentation**
  - API documentation
  - Video tutorials
  - Best practices guide

---

## 📞 Support & Contact

For questions, issues, or contributions:

- **GitHub Issues**: [Create an issue](https://github.com/your-username/flipkart_Automation_Testing/issues)
- **Email**: rajcharchil555@gmail.com
- **Documentation**: [Wiki](https://github.com/your-username/flipkart_Automation_Testing/wiki)

---

## 🙏 Acknowledgments

- **Selenium** - Web automation framework
- **Cucumber** - BDD framework
- **TestNG** - Test execution framework
- **WebDriverManager** - Automatic driver management
- **Flipkart** - For providing the platform to test

---

## 📊 Project Status

![GitHub last commit](https://img.shields.io/github/last-commit/your-username/flipkart_Automation_Testing)
![GitHub issues](https://img.shields.io/github/issues/your-username/flipkart_Automation_Testing)
![GitHub pull requests](https://img.shields.io/github/issues-pr/your-username/flipkart_Automation_Testing)

**Current Version**: 0.0.1-SNAPSHOT  
**Status**: 🟢 Active Development

---

<div align="center">

**Made with ❤️ for Quality Assurance**

⭐ Star this repo if you find it helpful!

</div>

