/**
 * Main class - Entry point for the application.
 * 
 * This class demonstrates a simple Java program that prints a welcome message
 * and iterates through numbers 1 to 5, displaying each value.
 * 
 * @author Coding Agent
 * @version 1.0
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Main entry point of the application.
     * 
     * Prints a welcome message and then iterates through numbers 1 to 5,
     * displaying each value to the console.
     * 
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Iterate through numbers 1 to 5 and display each value
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}