# 📚 Library Management System in Java

![Java](https://img.shields.io/badge/Language-Java-orange)
![License](https://img.shields.io/badge/License-MIT-green)
![Version](https://img.shields.io/badge/Version-1.0-blue)

---

## Table of Contents
- [Description](#description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Demo](#demo)
- [How to Run](#how-to-run)
- [Usage](#usage)
- [Author](#author)
- [License](#license)

---

## Description
This is a **console-based Library Management System** built in Java.  
It allows managing students and books with features like **check-in**, **check-out**, searching, and updating book quantities.  
The system prevents duplicate entries and tracks the **availability of each book**.

---

## Features
- ✅ Register new students
- ✅ Add new books
- ✅ Search books by ISBN or author
- ✅ Check out books to students
- ✅ Check in books from students
- ✅ Upgrade the quantity of books
- ✅ Display all registered students and all books
- ✅ Prevent duplicate students and books

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework (`ArrayList`)
- Console-based interaction

---

## Project Structure
```

college/
├── Book.java         # Class representing a Book
├── Books.java        # Class to manage a collection of books
├── Student.java      # Class representing a Student
├── Students.java     # Class to manage a collection of students
└── Library.java      # Main class with interactive menu

````

---

## How to Run
1. **Clone the repository**
```bash
git clone https://github.com/YourUsername/Library-Management-System-Java.git
````

2. **Navigate to the project folder**

```bash
cd Library-Management-System-Java
```

3. **Compile the Java files**

```bash
javac college/*.java
```

4. **Run the program**

```bash
java college.Library
```

5. **Follow the on-screen menu** to manage students and books.

---

## Usage

* Register students and books from the menu.
* Prevent duplicate entries by system validation.
* Check out and check in books, automatically updating availability.
* Upgrade the quantity of books when needed.
* Display all registered students and books anytime.

---

## Author

**Divyansh Ahuja**

* [GitHub](https://github.com/DivyanshAhuja08)
* [LinkedIn](https://www.linkedin.com/in/divyansh-ahuja/)

---

## License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this project with proper credit.

