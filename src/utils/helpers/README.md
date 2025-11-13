# README.md - Helpers Package Documentation

<!--
File: README.md
Location: src/utils/helpers/
Purpose: Documentation for the helpers package
-->

## Helpers Package

This package contains specialized helper classes for various operations.

### Available Classes

#### MathHelper
Mathematical utility functions including:
- `factorial(int n)` - Calculates factorial of a number
- `isPrime(int n)` - Checks if a number is prime

### Usage Example

```java
// Calculate factorial
long result = MathHelper.factorial(5); // Returns 120

// Check if number is prime
boolean isPrime = MathHelper.isPrime(7); // Returns true
```

### Notes

- All methods are static and can be called without instantiating the class
- Proper error handling is included for edge cases
- Methods include comprehensive JavaDoc comments
