public class modulusOperator10 {
    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 5;
        
        // Modulus operation to find remainder
        int result = num1 % num2;
        
        // Output the result
        System.out.println("The remainder when " + num1 + " is divided by " + num2 + " is: " + result);
        
        // Additional examples
        System.out.println("10 % 3 = " + (10 % 3));  // Output: 1 (10 divided by 3 gives a remainder of 1)
        System.out.println("20 % 6 = " + (20 % 6));  // Output: 2 (20 divided by 6 gives a remainder of 2)
        System.out.println("25 % 4 = " + (25 % 4));  // Output: 1 (25 divided by 4 gives a remainder of 1)
    }
}

/*
 * Modulus Operator in Java:
The modulus operator (%) is a mathematical operator that returns the remainder of the division of two numbers. It is widely used in programming for operations that involve remainders, divisibility checks, and cyclic behaviors.

1. Syntax of the Modulus Operator:
java
Copy code
result = dividend % divisor;
dividend: The number to be divided.
divisor: The number by which the division is performed.
result: The remainder after dividing the dividend by the divisor.
2. How it Works:
When you divide two numbers, the modulus operator returns the remainder of the division. For example:

java
Copy code
int result = 17 % 5;  // Output: 2
Explanation:

When 17 is divided by 5, the quotient is 3, and the remainder is 2.
Therefore, 17 % 5 = 2.
Another example:

java
Copy code
int result = 10 % 3;  // Output: 1
Explanation:

When 10 is divided by 3, the quotient is 3, and the remainder is 1.
Therefore, 10 % 3 = 1.
3. Key Points to Remember:
The modulus operator returns the remainder after division.
It is often used to check divisibility, find remainders, or perform cyclic operations.
4. Behavior with Negative Numbers:
One crucial aspect of the modulus operator is that the result takes the sign of the dividend (the numerator).

Example with a negative dividend:

java
Copy code
int result = -10 % 3;  // Output: -1
Explanation:

When -10 is divided by 3, the quotient is -4, and the remainder is -1.
The result retains the sign of the dividend, so -10 % 3 = -1.
Example with a negative divisor:

java
Copy code
int result = 10 % -3;  // Output: 1
Explanation:

When 10 is divided by -3, the quotient is -3, and the remainder is 1.
The result retains the sign of the dividend, so 10 % -3 = 1.
5. Modulus Operator with Floating-Point Numbers:
The modulus operator can also be used with floating-point numbers (like float or double), returning the remainder of division as a floating-point value.

java
Copy code
double result = 5.5 % 2;  // Output: 1.5
Explanation:

When 5.5 is divided by 2, the quotient is 2, and the remainder is 1.5.
Therefore, 5.5 % 2 = 1.5.
6. Common Use Cases:
Checking Divisibility:
The modulus operator is frequently used to check if a number is divisible by another. If a % b == 0, then a is divisible by b.
java
Copy code
if (num % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
Cyclic Behavior (e.g., Circular Arrays):
The modulus operator helps implement circular behaviors, such as cycling through an array or performing rotations.
java
Copy code
int[] arr = {10, 20, 30, 40, 50};
int index = 7;  // Beyond array bounds
System.out.println(arr[index % arr.length]);  // Output: 20 (7 % 5 = 2)
Alternating Pattern Generation (even/odd):
You can alternate between two values or actions using the modulus operator.
java
Copy code
for (int i = 0; i < 10; i++) {
    System.out.println(i % 2 == 0 ? "Even" : "Odd");
}
7. Example:
Here is a simple example where the modulus operator is used to check divisibility by 3 and 5:

java
Copy code
public class ModulusExample {
    public static void main(String[] args) {
        int number = 15;
        
        // Check if the number is divisible by both 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5");
        }
    }
}
8. Summary of Modulus Operator Properties:
Remainder Calculation: a % b returns the remainder after dividing a by b.
Sign of Result: The result has the same sign as the dividend.
Negative Divisors: The result may behave differently with negative divisors but still adheres to the sign rule.
Cyclic Behavior: Useful for wrapping around arrays or repeating patterns.
Divisibility Test: Used to check if one number is divisible by another.
9. Interview Question Examples:
What is the modulus operator used for in Java?

The modulus operator calculates the remainder when one number is divided by another.
What is the result of -15 % 4?

The result is -3. This is because -15 divided by 4 gives a quotient of -4, with a remainder of -3.
How can the modulus operator be used in a program to check if a number is divisible by 7?

If number % 7 == 0, then the number is divisible by 7.

 */