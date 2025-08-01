# Daily LeetCode Challenge 🧩

[![Java](https://img.shields.io/badge/language-Java-red)](https://www.java.com/)  
[![LeetCode](https://img.shields.io/badge/platform-LeetCode-ff69b4)](https://leetcode.com/)  
[![Last Commit](https://img.shields.io/github/last-commit/VIVEK252575AI/DSA)](https://github.com/VIVEK252575AI/DSA/commits/main)  

Welcome to my **Daily LeetCode Challenge** repository! This repo documents my journey through solving one LeetCode problem every day, tracking my progress, improving my problem-solving skills, and mastering data structures & algorithms in Java.

---

## 🚀 Table of Contents

1. [About](#about)  
2. [Repository Structure](#repository-structure)  
3. [Daily Challenge Workflow](#daily-challenge-workflow)  
4. [How to Run Solutions Locally](#how-to-run-solutions-locally)  
5. [Progress Tracker](#progress-tracker)  
6. [Contributing](#contributing)  
7. [License](#license)  

---

## 📖 About

- **Goal**: Solve and document **one** LeetCode problem **per day** for sustained DSA mastery.  
- **Language**: Java (with clean, commented code).  
- **Approach**:  
  1. Read and analyze the prompt thoroughly.  
  2. Sketch out data structures and algorithmic approach.  
  3. Implement solution in a dedicated Java class.  
  4. Add explanation and time/space complexity in comments.  
  5. Write and run test cases for validation.  

---

## 📂 Repository Structure


- **`daily-solutions/`**: Each file is named `<YYYY-MM-DD>_<ProblemName>.java`  
- **`tests/`**: JUnit test suite that runs through sample/custom tests.  
- **`utils/`**: Shared helpers (I/O, assertions).  

---

## 🛠 Daily Challenge Workflow

1. **Create** a new Java class from the template in `daily-solutions/template/`.  
2. **Rename** file to `YYYY-MM-DD_<ProblemName>.java`.  
3. **Implement** solution with:
   - Clear method signature.
   - In-code comments for logic steps.
   - Analysis of time & space complexity.
4. **Write** test cases in `tests/DailySolutionTests.java`.  
5. **Commit & Push**:
   ```bash
   git add daily-solutions/2025-08-02_*.java tests/DailySolutionTests.java
   git commit -m "Solve [LeetCode #<ID>] <ProblemName> — YYYY-MM-DD"
   git push
