/**
 * Main class - Entry point for the application.
 * 
 * This class demonstrates basic Java programming concepts including:
 * - Console output using System.out
 * - For loop iteration
 * - String formatting and printing
 * 
 * @author Coding-Agent-Test
 * @version 1.0
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    /**
     * Main method - Application entry point.
     * 
     * Prints a welcome message and then iterates through numbers 1 to 5,
     * printing each value to demonstrate loop functionality.
     * 
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        
        // Print welcome message to console
        System.out.printf("Hello and welcome!");

        // Iterate through numbers 1 to 5 and print each value
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}