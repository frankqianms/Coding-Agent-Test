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

        // Enhanced functionality
        System.out.println("\n--- Enhanced Features ---");
        displayGreeting("User");
        int sum = calculateSum(1, 5);
        System.out.println("Sum of numbers 1 to 5: " + sum);
        displayFactorial(5);
    }

    /**
     * Display a personalized greeting message
     * @param name the name to greet
     */
    private static void displayGreeting(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    /**
     * Calculate the sum of numbers from start to end (inclusive)
     * @param start the starting number
     * @param end the ending number
     * @return the sum of all numbers in the range
     */
    private static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Calculate and display the factorial of a number
     * @param n the number to calculate factorial for
     */
    private static void displayFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + ": " + factorial);
    }
}