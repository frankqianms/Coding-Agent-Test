/**
 * Main class - Entry point for the Java application.
 * This program demonstrates basic console output and loop iteration.
 */
public class Main {
    /**
     * Main method - The starting point of the program execution.
     * Prints a welcome message and then displays numbers from 1 to 5.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.printf("Hello and welcome!");

        // Loop through numbers 1 to 5 and print each value
        for (int i = 1; i <= 5; i++) {
            // Display the current iteration value
            System.out.println("i = " + i);
        }
    }
}