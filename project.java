import java.util.Scanner;

public class project{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Display the greeting message
        System.out.println("Hello, " + name + "! Welcome to the Java program.");
        
        // Close the scanner
        scanner.close();
    }
}

