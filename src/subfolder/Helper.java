/**
 * Helper class - Utility functions for the application
 * 
 * This class is located in the subfolder directory and demonstrates
 * how to add comments to files within nested folder structures.
 * It provides utility methods that can be used throughout the application.
 * 
 * @author Coding Agent Test
 * @version 1.0
 * @since 2025-11-14
 */
package subfolder;

public class Helper {
    
    /**
     * Adds two integers together
     * 
     * This is a simple utility method that demonstrates basic arithmetic
     * operations and proper documentation in a nested file.
     * 
     * @param a The first integer to add
     * @param b The second integer to add
     * @return The sum of a and b
     */
    public static int add(int a, int b) {
        // Perform addition and return the result
        return a + b;
    }
    
    /**
     * Concatenates two strings with a space in between
     * 
     * This method demonstrates string manipulation and proper
     * documentation of utility functions.
     * 
     * @param str1 The first string
     * @param str2 The second string
     * @return A new string containing str1 and str2 separated by a space
     */
    public static String concatenate(String str1, String str2) {
        // Combine the strings with a space separator
        return str1 + " " + str2;
    }
    
    /**
     * Checks if a number is even
     * 
     * This method uses the modulo operator to determine if a number
     * is divisible by 2, which indicates it's an even number.
     * 
     * @param number The integer to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        // Use modulo operator to check if divisible by 2
        return number % 2 == 0;
    }
}
