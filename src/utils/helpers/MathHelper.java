package utils.helpers;

/**
 * MathHelper - Mathematical utility functions.
 * 
 * This class demonstrates comments in deeply nested folders.
 * Located in nested folder: src/utils/helpers/
 * 
 * @author Coding Agent
 * @version 1.0
 */
public class MathHelper {
    
    /**
     * Calculates the factorial of a number.
     * 
     * @param n The number to calculate factorial for (must be non-negative)
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        // Validate input - factorial is only defined for non-negative integers
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        // Base case: 0! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Calculate factorial iteratively
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    /**
     * Checks if a number is prime.
     * 
     * @param n The number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }
        
        // Check for divisibility up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        
        return true; // No divisors found, number is prime
    }
}
