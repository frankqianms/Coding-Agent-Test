/**
 * StringHelper.java - Utility class for string operations
 * 
 * This file is located in the src/utils folder and demonstrates
 * how to add comments to files in nested folder structures.
 * 
 * This class provides helper methods for common string manipulations
 * that can be used throughout the application.
 * 
 * @author Coding Agent
 * @version 1.0
 */

package utils;

public class StringHelper {
    
    /**
     * Reverses a given string
     * 
     * @param input The string to be reversed
     * @return The reversed string, or null if input is null
     */
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Checks if a string is null or empty
     * 
     * @param input The string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }
    
    /**
     * Capitalizes the first letter of a string
     * 
     * @param input The string to capitalize
     * @return The string with the first letter capitalized, or null if input is null
     */
    public static String capitalizeFirst(String input) {
        if (isNullOrEmpty(input)) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
