<!-- README.md for utils folder -->
<!-- This file documents the purpose and contents of the utils directory -->

# Utils Directory

## Overview
This directory contains utility classes and helper functions used throughout the Coding-Agent-Test application.

## Purpose
The utils folder demonstrates:
- How to organize code into logical subdirectories
- How to add comments to files in nested folder structures
- Best practices for utility class documentation

## Files in this Directory

### StringHelper.java
A utility class that provides common string manipulation methods:
- `reverse(String)` - Reverses a string
- `isNullOrEmpty(String)` - Checks if a string is null or empty
- `capitalizeFirst(String)` - Capitalizes the first letter of a string

## Usage
These utilities can be imported and used in any part of the application:

```java
import utils.StringHelper;

public class Example {
    public static void main(String[] args) {
        String reversed = StringHelper.reverse("hello");
        System.out.println(reversed); // Outputs: olleh
    }
}
```

---
*This directory is part of the Coding-Agent-Test repository*
