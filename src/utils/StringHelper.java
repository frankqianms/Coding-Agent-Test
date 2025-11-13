/**
 * StringHelper utility class
 * 
 * This class provides utility methods for common string operations.
 * It demonstrates the use of comments in files within subdirectories.
 * 
 * @author Coding Agent
 * @version 1.0
 */
package utils;

public class StringHelper {
    
    /**
     * Reverses a given string
     * 
     * This method takes a string as input and returns the reversed version.
     * If the input is null or empty, it returns the input as-is.
     * 
     * @param input The string to be reversed
     * @return The reversed string, or the original if null/empty
     */
    public static String reverse(String input) {
        // Handle null or empty input
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        // Use StringBuilder for efficient string reversal
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Converts a string to title case
     * 
     * This method capitalizes the first letter of each word in the input string.
     * 
     * @param input The string to convert to title case
     * @return The title-cased string
     */
    public static String toTitleCase(String input) {
        // Handle null or empty input
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        // Split the string into words
        String[] words = input.split("\\s+");
        StringBuilder titleCase = new StringBuilder();
        
        // Process each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter, lowercase the rest
                titleCase.append(Character.toUpperCase(word.charAt(0)));
                titleCase.append(word.substring(1).toLowerCase());
                titleCase.append(" ");
            }
        }
        
        // Return trimmed result
        return titleCase.toString().trim();
    }
}
