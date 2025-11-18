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

        // Test the new methods
        System.out.println("\nTesting factorial method:");
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(0) = " + factorial(0));
        
        System.out.println("\nTesting reverse method:");
        System.out.println("reverse(\"hello\") = " + reverse("hello"));
        System.out.println("reverse(\"Java\") = " + reverse("Java"));
    }

    // Example: Add a method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Example: Add a method to reverse a string
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}