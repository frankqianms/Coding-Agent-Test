<!--
  README.md
  
  This file is located in a subdirectory (src/models/) to demonstrate
  how comments can be added to Markdown files within nested folder structures.
  
  File Purpose: Documentation for the models package
  Location: src/models/README.md
  Format: Markdown with HTML comment blocks
  Author: Coding Agent Test
-->

# Models Package

This directory contains model classes for the application.

## Available Models

### User.java
Represents a user entity with the following properties:
- name: User's full name
- age: User's age
- email: User's email address

## Usage Example

```java
User user = new User("John Doe", 30, "john@example.com");
System.out.println(user.getName());
```

## Notes
- All model classes follow standard JavaBean conventions
- Properties are private with public getters
- Constructors are provided for easy object creation
