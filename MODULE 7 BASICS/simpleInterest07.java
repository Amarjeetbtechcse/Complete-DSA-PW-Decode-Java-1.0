import java.util.Scanner; // Import the Scanner class for user input

public class simpleInterest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Prompt user to enter principal amount
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble(); // Read principal amount

        // Prompt user to enter rate of interest
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble(); // Read rate of interest

        // Prompt user to enter time period
        System.out.print("Enter the time period: ");
        double t = sc.nextDouble(); // Read time period

        // Calculate simple interest
        double si = (p * r * t) / 100.0; // Use 100.0 to ensure accurate division

        // Print the calculated simple interest
        System.out.println("Simple Interest is: " + si);

        sc.close(); // Close Scanner to prevent resource leak
    }
}
