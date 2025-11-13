/**
 * StringHelper class - Utility class for string operations
 * 
 * This class provides helper methods for common string manipulation tasks.
 * It demonstrates how to add comments to Java files within subdirectories.
 * 
 * Location: src/utils/StringHelper.java
 * 
 * @author Coding Agent Test
 * @version 1.0
 */
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
     * Checks if a string is empty or null
     * 
     * @param input The string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
    
    /**
     * Capitalizes the first letter of a string
     * 
     * @param input The string to capitalize
     * @return The string with the first letter capitalized, or the original string if null/empty
     */
    public static String capitalize(String input) {
        if (isEmpty(input)) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
