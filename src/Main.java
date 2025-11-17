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

        // Demonstrate the new static methods
        System.out.println("\nDemo of static methods:");
        System.out.println("sum(5, 3) = " + sum(5, 3));
        System.out.println("reverse(\"Hello\") = " + reverse("Hello"));
    }

    // Example: Add a static method to sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Example: Add a static method to reverse a string
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}