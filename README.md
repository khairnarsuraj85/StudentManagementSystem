# Student Management System

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)
![License](https://img.shields.io/badge/License-MIT-green)

A command-line student management system built with Java and MySQL using JDBC.

## Features

- Add new student records
- View all students
- Update student information
- Delete student records
- Simple command-line interface
- MySQL database integration

## Prerequisites

- Java JDK 17 or later
- MySQL Server 8.0+
- MySQL Connector/J JDBC driver

## Setup Instructions

### 1. Database Setup

1. Create the database:
```sql
CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(50) NOT NULL,
    age INT NOT NULL
);
