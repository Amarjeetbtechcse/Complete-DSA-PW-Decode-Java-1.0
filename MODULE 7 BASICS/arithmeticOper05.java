public class arithmeticOper05 {
    public static void main(String[] args) {
        int a = 9; // Declare and initialize a with 9
        int b = 5; // Declare and initialize b with 5

        int c = a + b; // Calculate sum
        System.out.println("Sum of a and b is: " + c); // Output sum (14)

        int d = a - b; // Calculate difference
        System.out.println("Difference of a and b is: " + d); // Output difference (4)

        int e = a * b; // Calculate product
        System.out.println("Product of a and b is: " + e); // Output product (45)

        int f = a / b; // Perform integer division
        System.out.println("Division of a and b is: " + f); // Output quotient (1)

        /*Why is f equal to 1?
        The result of a / b is 1 because in Java, division between two integers performs integer division. This means:

The fractional part (remainder) of the division is truncated, not rounded.
9 / 5 = 1.8, but the .8 is discarded, leaving 1. */

double j = (double) a / b;
System.out.println("Division of a and b is: " + j); // Output (1.8)

    }
}
