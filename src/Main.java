/**
 * Main class for the Coding Agent Test application.
 * This is the entry point for the application and demonstrates basic Java functionality.
 * 
 * @author Coding Agent Test Team
 * @version 1.0
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Main method - the entry point of the application.
     * Prints a welcome message and demonstrates a simple loop that counts from 1 to 5.
     * 
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        
        // Print welcome message to the console
        System.out.printf("Hello and welcome!");

        // Loop through numbers 1 to 5 and print each value
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            
            // Print the current iteration value
            System.out.println("i = " + i);
        }
    }
}