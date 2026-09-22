# Katalon Studio Multi-Paradigm Automation Framework

An enterprise-grade cross-platform test automation framework built on **Katalon Studio v11.5+**, supporting Web, Mobile (Android/iOS), and API testing. 

This repository leverages a dual-branch architecture to support two distinct execution paradigms:
* **`bdd`**: Cucumber BDD execution using Gherkin feature files and step bindings.
* **`non-bdd`**: Native modular automation using the Page Object Model (POM) and script-based test runners.

---

## 🛠 Tech Stack & Dependencies

* **Core Engine:** Katalon Studio v11.5+
* **Language Runtime:** Groovy 3.0+ / Java 17
* **Web Automation:** Selenium WebDriver 4.x
* **Mobile Automation:** Appium v2.x (UiAutomator2 & XCUITest drivers)
* **BDD Engine (Branch: `bdd`):** Cucumber JVM v7.x
* **VCS Strategy:** Git Dual-Branch Isolated Paradigm (`bdd` | `non-bdd`)

---

## 🌿 Branching Architecture & Paradigm Strategy

The repository isolates design patterns across dedicated branches to prevent artifact pollution:

| Feature / Aspect | `bdd` Branch | `non-bdd` Branch |
| :--- | :--- | :--- |
| **Paradigm** | Behavior-Driven Development (BDD) | Native Modular Page Object Model (POM) |
| **Test Specification** | Gherkin `.feature` files | Katalon Test Cases & Groovy Runner Scripts |
| **Business Bindings** | Cucumber Step Definitions (`Include/scripts/groovy`) | Custom Keywords (`Keywords/pages/*`) |
| **Target Audience** | Cross-functional teams, BAs, QA, Devs | Automation Engineers requiring direct programmatic control |

To switch paradigms locally:
```bash
# Work on BDD implementation
git checkout bdd

# Work on Native POM modular implementation
git checkout non-bdd
```

🚀 Getting Started
Prerequisites
Katalon Studio Enterprise / Free v11.5+ installed.

Node.js & Appium v2.x (for mobile automation):

Bash
npm install -g appium
appium driver install uiautomator2
appium driver install xcuitest
Java Development Kit (JDK 17) configured in your system path.

📄 License & Maintainer
Maintainer: saydova
Project Type: Test Automation Framework
