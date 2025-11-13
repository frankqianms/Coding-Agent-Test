/**
 * Main class demonstrating basic Java program structure.
 * This class serves as the entry point for the application and
 * demonstrates a simple loop with console output.
 *
 * @author Coding Agent
 * @version 1.0
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Main method - the entry point of the Java application.
     * Prints a welcome message and demonstrates a simple loop that
     * outputs numbers from 1 to 5.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Display a welcome message to the user
        System.out.printf("Hello and welcome!");

        // Loop through numbers 1 to 5 and print each value
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}