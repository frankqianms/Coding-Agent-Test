// Main class to demonstrate a simple for loop and print statements
public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello and welcome!");

        // Loop from 1 to 5 and print the value of i in each iteration
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Additional functionality: Calculate and display the sum of numbers from 1 to 5
        int sum = calculateSum(5);
        System.out.println("The sum of numbers from 1 to 5 is: " + sum);
    }

    /**
     * Calculates the sum of numbers from 1 to n
     * @param n the upper limit for the sum calculation
     * @return the sum of numbers from 1 to n
     */
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}