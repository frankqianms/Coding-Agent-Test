# Utils Package README

## Overview
This package contains utility classes that provide helper methods for common operations.

## Files

### StringHelper.java
Utility class for string manipulation operations.

**Methods:**
- `reverse(String input)` - Reverses a string
- `toTitleCase(String input)` - Converts string to title case

**Key Features:**
- Comprehensive JavaDoc comments
- Null-safe implementations
- Efficient algorithms using StringBuilder

### MathHelper.java
Utility class for mathematical operations.

**Methods:**
- `factorial(int n)` - Calculates factorial of a number
- `isPrime(int n)` - Checks if a number is prime

**Key Features:**
- Detailed method documentation
- Input validation with meaningful error messages
- Optimized algorithms for performance

## Comments Best Practices Demonstrated

### 1. Class-level Comments
Each class includes:
- Purpose and description
- Author information
- Version number

### 2. Method-level Comments
Each method includes:
- Clear description of functionality
- Parameter documentation (@param)
- Return value documentation (@return)
- Exception documentation (@throws)

### 3. Inline Comments
Strategic inline comments explain:
- Complex logic
- Algorithm choices
- Edge case handling
- Performance considerations

## Usage Example
```java
// Using StringHelper
String reversed = StringHelper.reverse("hello");
String title = StringHelper.toTitleCase("hello world");

// Using MathHelper
long fact = MathHelper.factorial(5);
boolean prime = MathHelper.isPrime(17);
```

## Compilation
All files in this package can be compiled with:
```bash
javac utils/*.java
```

---
*This README demonstrates documentation for files within a folder structure*
