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
        // Note: printf does not add a newline, so first loop output will appear on the same line
        System.out.printf("Hello and welcome!");

        // Print numbers 1 through 5 to demonstrate basic loop iteration
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}