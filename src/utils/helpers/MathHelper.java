/**
 * MathHelper class - Mathematical utility functions
 * 
 * This class provides helper methods for common mathematical operations.
 * It demonstrates how to add comments to Java files within deeply nested subdirectories.
 * 
 * Location: src/utils/helpers/MathHelper.java
 * 
 * @author Coding Agent Test
 * @version 1.0
 */
public class MathHelper {
    
    /**
     * Calculates the factorial of a number
     * 
     * @param n The number to calculate factorial for (must be non-negative)
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Checks if a number is prime
     * 
     * @param n The number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        // Check odd divisors up to square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
