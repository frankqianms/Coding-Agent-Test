import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Main class definition
public class Main {
    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.printf("Hello and welcome!");

        // Loop from 1 to 5 and print the value of i each time
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Demonstrate file reading functionality
        System.out.println("\nReading file contents:");
        readAndPrintFile("src/test.txt");
    }

    /**
     * Reads a file line by line and prints its contents to the console.
     * Each line is prefixed with its line number.
     * 
     * @param filePath the path to the file to be read
     */
    public static void readAndPrintFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            
            // Read each line from the file and print it with line number
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            // Handle file reading errors gracefully
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
