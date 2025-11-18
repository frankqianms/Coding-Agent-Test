// Main class definition
public class Main {
    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.printf("Hello and welcome!");

        // Loop from 1 to 5 and print the value of i in each iteration
        for (int i = 1; i <= 5; i++) {
            // Print the current value of i
            System.out.println("i = " + i);
        }
    }

    /**
     * Calculates the sum of all numbers from 1 to n (inclusive).
     * This method demonstrates basic arithmetic operations and can be used
     * to complement the loop functionality shown in the main method.
     * 
     * @param n the upper limit of the range (must be positive)
     * @return the sum of all numbers from 1 to n
     */
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}