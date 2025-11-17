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
        
        // Additional functionality added at line 16
        System.out.println("\nDemonstrating additional features:");
        displaySquares(5);
        System.out.println("Sum of numbers 1-10: " + calculateSum(10));
    }
    
    /**
     * Displays the squares of numbers from 1 to n
     * @param n the upper limit
     */
    private static void displaySquares(int n) {
        System.out.println("Squares:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "² = " + (i * i));
        }
    }
    
    /**
     * Calculates the sum of numbers from 1 to n
     * @param n the upper limit
     * @return the sum of numbers from 1 to n
     */
    private static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}