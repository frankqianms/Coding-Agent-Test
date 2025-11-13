/**
 * Main.java
 * 
 * This is the main entry point for the application.
 * It demonstrates basic Java programming concepts including:
 * - Console output using System.out
 * - Loop structures (for loop)
 * - Basic program flow control
 * 
 * @author Coding Agent Test
 * @version 1.0
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Main method - entry point of the application
     * Prints a welcome message and demonstrates a simple loop
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}