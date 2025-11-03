/**
 * Main class - Entry point for the application
 * 
 * This is a simple demonstration program that prints a welcome message
 * and displays numbers from 1 to 5 in a loop.
 * 
 * @author Coding Agent Test
 * @version 1.0
 */
public class Main {
    
    /**
     * Main method - Program execution starts here
     * 
     * This method performs two main tasks:
     * 1. Prints a welcome message to the console
     * 2. Iterates through numbers 1-5 and displays each value
     * 
     * @param args Command line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        // Display welcome message to the user
        System.out.println("Hello and welcome!");

        // Loop through numbers 1 to 5 and print each iteration
        // This demonstrates basic loop syntax and console output
        for (int i = 1; i <= 5; i++) {
            // Print current iteration value with descriptive label
            System.out.println("i = " + i);
        }
    }
}