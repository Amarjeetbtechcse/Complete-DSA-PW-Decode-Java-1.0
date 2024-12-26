import java.util.Scanner;

public class inputScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read name
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Read age
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        // Consume the newline character left by nextInt()
        sc.nextLine();

        // Read address
        System.out.println("Enter your address:");
        String address = sc.nextLine();

        // Read phone number (use long)
        System.out.println("Enter your phone number:");
        long phone = sc.nextLong();  // Use long instead of int
        
        // Consume the newline character left by nextLong()
        sc.nextLine();

        // Read email
        System.out.println("Enter your email:");
        String email = sc.nextLine();

        // Print the details
        System.out.println("Your details are:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);

        sc.close();
    }
}

/*In Java, the Scanner class provides several methods to read different types of input from the user. Here’s a list of common input types and the corresponding methods:

1. nextInt()
Reads an integer (int).
Example:
java
Copy code
int num = sc.nextInt();
2. nextDouble()
Reads a double-precision floating-point number (double).
Example:
java
Copy code
double price = sc.nextDouble();
3. nextFloat()
Reads a floating-point number (float).
Example:
java
Copy code
float temperature = sc.nextFloat();
4. nextLong()
Reads a long integer (long).
Example:
java
Copy code
long population = sc.nextLong();
5. nextBoolean()
Reads a boolean value (true or false).
Example:
java
Copy code
boolean isActive = sc.nextBoolean();
6. nextLine()
Reads a full line of text, including spaces.
Example:
java
Copy code
String name = sc.nextLine();
7. next()
Reads the next token (word) as a string, stopping at spaces.
Example:
java
Copy code
String firstName = sc.next();
8. nextByte()
Reads a byte value.
Example:
java
Copy code
byte b = sc.nextByte();
9. nextShort()
Reads a short integer (short).
Example:
java
Copy code
short number = sc.nextShort();
Example Usage:
java
Copy code
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // consume the newline

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        sc.close();
    }
}
Important Notes:
nextLine() and next(): If you use nextInt() or nextDouble() before nextLine(), make sure to call sc.nextLine() after them to consume the newline character.
next(): Reads only a single token (word) and does not handle spaces in input. For multiple words, use nextLine(). */