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

        // Additional functionality
        int sum = calculateSum(1, 5);
        System.out.println("\nSum of numbers 1 to 5: " + sum);
        
        System.out.println("\nChecking even numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(formatNumberInfo(i));
        }
    }

    /**
     * Calculates the sum of numbers in a range from start to end (inclusive)
     */
    public static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Checks if a number is even
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Formats number information including whether it's even or odd
     */
    public static String formatNumberInfo(int number) {
        String evenOrOdd = isEven(number) ? "even" : "odd";
        return number + " is " + evenOrOdd;
    }
}