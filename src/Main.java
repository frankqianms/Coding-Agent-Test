/**
 * Main class - Entry point for the application.
 * 
 * This simple demonstration program showcases basic Java concepts including:
 * - Console output using System.out
 * - For-loop iteration
 * - String formatting and concatenation
 */
public class Main {
    /**
     * Main method - Starting point of program execution.
     * 
     * The program performs two primary actions:
     * 1. Displays a welcome message to the user
     * 2. Demonstrates loop iteration by counting from 1 to 5
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Display welcome message to greet the user
        // Note: printf is used here without a newline, so the output will be on the same line
        // as the subsequent loop output unless explicitly handled
        System.out.printf("Hello and welcome!");

        // Iterate from 1 to 5 (inclusive) to demonstrate loop functionality
        // This loop showcases a standard counting pattern commonly used in Java
        // Each iteration prints the current counter value in a formatted string
        for (int i = 1; i <= 5; i++) {
            // Print the current iteration number
            // The format "i = <value>" provides clear output showing the variable name and its value
            System.out.println("i = " + i);
        }
    }
}