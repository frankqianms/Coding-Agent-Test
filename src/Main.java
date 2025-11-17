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

        // Demonstrate utility methods
        System.out.println("\nUtility Methods Demonstration:");
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Reverse of 'hello': " + reverse("hello"));
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Sum of [1,2,3,4,5]: " + sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Fibonacci(10): " + fibonacci(10));
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
    }

    // TODO: Add more code here

    // Example: Add a static method to calculate factorial
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input not allowed");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Example: Add a static method to reverse a string
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Example: Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Example: Method to compute the sum of an integer array
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Example: Method to compute the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input not allowed");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Example: Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}