/**
 * Main class - Entry point for the application.
 * This is a simple Java program that demonstrates basic console output
 * and iteration using a for loop.
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Main method - The entry point of the Java application.
     * Prints a welcome message and demonstrates a simple counting loop.
     * 
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        
        // Print a welcome message to the console
        System.out.printf("Hello and welcome!");

        // Iterate from 1 to 5 and print each iteration number
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            
            // Print the current iteration value
            System.out.println("i = " + i);
        }
    }
}