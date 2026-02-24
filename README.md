# 📱 Phone Management System (Java)

## 📌 Project Overview
The Phone Management System is a Java-based console application developed to manage and organize mobile phone records efficiently. 
This project demonstrates core Object-Oriented Programming (OOP) concepts along with the Java Collections Framework, sorting mechanisms,
custom comparators, and date handling using the Java Time API.

The system allows users to add, remove, sort, and filter phones based on different attributes such as cost, brand, and release date.

---

## 🚀 Features
- Add new phones to the system
- Remove phones using object reference
- Remove phones using Phone ID
- Sort phones based on:
  - Cost (Natural Ordering using Comparable)
  - Release Date
  - Name (Custom Comparator)
- Filter phones by brand
- Display detailed phone information
- Uses Java LocalDate for managing release dates

---

## 🏗️ Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Comparable Interface
- Comparator Interface
- Java Time API (LocalDate)
- Iterator Interface

---

## 📂 Project Structure

PhoneManagementSystem
│
├── Main.java
├── Phone.java
├── PhoneManager.java
└── SortByName.java

---

## 🧩 Class Explanation

### 1️⃣ Phone Class
The Phone class represents a mobile phone entity.

Attributes:
- id → Unique phone identifier
- name → Phone model name
- brand → Manufacturer brand
- cost → Price of the phone
- releaseDate → Phone launch date

Key Features:
- Implements Comparable interface
- Natural sorting based on phone cost
- Displays phone details using display() method.

---

### 2️⃣ PhoneManager Class
The PhoneManager class manages all phone-related operations.

This class extends the Phone class and maintains a list of phones using ArrayList.

Functionalities:
- Add phones
- Remove phones
- Remove phone by ID
- Sort phones by cost
- Sort phones by release date
- Filter phones by brand

Concepts Used:
- ArrayList
- Iterator
- Comparator Sorting

---

### 3️⃣ SortByName Class
SortByName implements Comparator interface to provide custom sorting logic.

Purpose:
Sort phones alphabetically based on phone name.

Example:
A → Z sorting of phone names.

---

### 4️⃣ Main Class
The Main class acts as the entry point of the application.

Responsibilities:
- Creates phone objects
- Adds phones to PhoneManager
- Performs sorting operations
- Displays phone information

---

## ⚙️ Functional Workflow

1. Create Phone objects.
2. Add phones into PhoneManager.
3. Perform operations like:
   - Sorting
   - Filtering
   - Removing phones.
4. Display updated phone records.

---

## 🔄 Sorting Implemented

Natural Sorting:
Using Comparable Interface → Sort by Cost.

Custom Sorting:
Using Comparator Interface →
- Sort by Name
- Sort by Release Date

---

## 📅 Example Phone Data

| ID | Name | Brand | Cost | Release Date |
|----|------|-------|------|-------------|
| 1 | iPhone 13 | Apple | 999.99 | 2021-09-10 |
| 2 | Galaxy S21 | Samsung | 799.99 | 2021-01-15 |
| 3 | Pixel 6 | Google | 599.99 | 2021-10-22 |

---

## ▶️ How to Run the Project

Step 1: Clone Repository
git clone <repository-link>

Step 2: Open Project in IDE
- IntelliJ IDEA
- Eclipse
- VS Code

Step 3: Compile and Run
Run Main.java

---

## 🧠 Concepts Demonstrated
- Inheritance
- Encapsulation
- Polymorphism
- Comparable vs Comparator
- Collections Handling
- Iterator Usage
- Java Date API

---

