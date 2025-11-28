//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Calculate and display the sum of numbers from 1 to 10
        int sum = calculateSum(10);
        System.out.println("\nSum of numbers from 1 to 10: " + sum);

        // Display a greeting message
        String name = "User";
        greet(name);
    }

    /**
     * Calculates the sum of numbers from 1 to n.
     * @param n the upper limit of the range (must be non-negative)
     * @return the sum of numbers from 1 to n, or 0 if n is negative
     */
    public static int calculateSum(int n) {
        if (n < 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Displays a personalized greeting message.
     * @param name the name to greet (defaults to "Guest" if null or empty)
     */
    public static void greet(String name) {
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }
}