/**
 * Main class - Entry point for the application
 * 
 * This is a simple demonstration program that prints a welcome message
 * and demonstrates a basic loop iteration from 1 to 5.
 * 
 * @author Coding Agent Test Repository
 * @version 1.0
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Main method - The entry point of the Java application
     * 
     * This method performs two main operations:
     * 1. Prints a welcome message to the console
     * 2. Iterates through numbers 1 to 5 and prints each value
     * 
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        
        // Print welcome message to greet the user
        System.out.printf("Hello and welcome!");

        // Demonstrate a simple loop that counts from 1 to 5
        // This loop iterates exactly 5 times, printing each iteration number
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            
            // Print the current iteration value
            System.out.println("i = " + i);
        }
    }
}