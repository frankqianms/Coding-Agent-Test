/**
 * Helper.java
 * 
 * This file is located in a subdirectory (src/utils/) to demonstrate
 * how comments can be added to files within nested folder structures.
 * 
 * Purpose: Utility helper class providing common helper functions
 * Location: src/utils/Helper.java
 * 
 * @author Coding Agent Test
 * @version 1.0
 */

public class Helper {
    /**
     * Prints a formatted message to the console
     * 
     * @param message The message to print
     */
    public static void printMessage(String message) {
        System.out.println("[Helper] " + message);
    }
    
    /**
     * Adds two integers and returns the result
     * 
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
