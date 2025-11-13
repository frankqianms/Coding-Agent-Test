/**
 * MathHelper utility class
 * 
 * This class provides utility methods for common mathematical operations.
 * It includes methods for basic calculations and number manipulations.
 * 
 * @author Coding Agent
 * @version 1.0
 */
package utils;

public class MathHelper {
    
    /**
     * Calculates the factorial of a non-negative integer
     * 
     * This method computes n! (n factorial) using iteration.
     * For n = 0, it returns 1 (by definition of 0!).
     * 
     * @param n The non-negative integer to calculate factorial for
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        // Validate input - factorial is only defined for non-negative integers
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }
        
        // Calculate factorial iteratively
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    /**
     * Checks if a number is prime
     * 
     * A prime number is a natural number greater than 1 that has no positive
     * divisors other than 1 and itself.
     * 
     * @param n The number to check for primality
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }
        
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        
        // Even numbers (except 2) are not prime
        if (n % 2 == 0) {
            return false;
        }
        
        // Check for divisors up to square root of n
        // Only need to check odd numbers
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;  // Found a divisor, not prime
            }
        }
        
        // No divisors found, number is prime
        return true;
    }
}
