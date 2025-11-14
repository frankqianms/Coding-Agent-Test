package utils;

/**
 * StringHelper - Utility class for string operations.
 * 
 * This class provides helper methods for common string manipulation tasks.
 * Located in nested folder: src/utils/
 * 
 * @author Coding Agent
 * @version 1.0
 */
public class StringHelper {
    
    /**
     * Reverses the input string.
     * 
     * @param input The string to reverse
     * @return The reversed string
     */
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        // Use StringBuilder for efficient string reversal
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Checks if a string is empty or null.
     * 
     * @param input The string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isEmpty(String input) {
        // Check for null or empty string
        return input == null || input.trim().isEmpty();
    }
}
