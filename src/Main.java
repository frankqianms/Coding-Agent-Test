/**
 * Main class demonstrates a simple Java program.
 * This class serves as the entry point for the application and prints
 * a welcome message followed by a sequence of numbers.
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * The main method is the entry point of the Java application.
     * It prints a welcome message and then displays numbers from 1 to 5.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        
        // Print a welcome message to the console
        System.out.printf("Hello and welcome!");

        // Loop through numbers 1 to 5 and print each value
        // This demonstrates a simple for loop in Java
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            
            // Print the current iteration value
            System.out.println("i = " + i);
        }
    }
}