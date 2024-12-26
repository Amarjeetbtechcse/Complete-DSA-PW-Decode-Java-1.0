import java.util.Scanner;

public class typeCasting11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        // Implicit casting: int to double
        double number = num;  // No need for any explicit method call, just assignment
        
        System.out.println("Entered number is: " + number);
        
        sc.close();  // Always close the scanner
    }
}
/*
 * Type Casting in Java
Type casting in Java refers to converting one data type into another. It can be used for both primitive data types (such as int, char, float, etc.) and object references (such as converting one class type to another). In Java, type casting is categorized into two types:

Implicit Casting (Widening)
Explicit Casting (Narrowing)
1. Implicit Casting (Widening)
Definition: Implicit casting is performed by the Java compiler automatically when a smaller data type is assigned to a larger data type.
When it happens: This occurs when you assign a value of a lower data type (e.g., int) to a higher data type (e.g., long or double). Java does this automatically because the larger type can hold all the possible values of the smaller type without loss of data.
Examples:
int to long
float to double
char to int
No explicit syntax is required for implicit casting, and it does not result in any loss of data.

Example:
java
Copy code
int num = 10;
double result = num;  // Implicit casting: int to double
2. Explicit Casting (Narrowing)
Definition: Explicit casting, also known as narrowing, happens when a larger data type is assigned to a smaller data type. Since this conversion can lead to loss of data (such as truncating decimals or rounding), Java requires explicit instructions from the programmer.
When it happens: This occurs when converting from a type with a larger range to a type with a smaller range, such as double to int, or long to short.
Examples:
double to int
long to int
float to short
To perform explicit casting, you use the cast operator (type).

Example:
java
Copy code
double num = 9.99;
int result = (int) num;  // Explicit casting: double to int (decimal part is lost)
Key Points About Type Casting:
Implicit Casting (Widening):

Happens automatically when converting to a larger type.
No data loss.
Examples: int to long, float to double.
Explicit Casting (Narrowing):

Must be explicitly specified by the programmer.
Can result in data loss (e.g., truncating decimals).
Examples: double to int, long to short.
Primitive Types:

You can perform type casting between primitive types (e.g., int to double), but you need to be cautious when narrowing types (e.g., double to int).
Casting Between Objects:

When casting between object types (e.g., between Object and a specific class type), you must ensure that the objects are compatible. This is commonly done with downcasting (casting a parent class type to a child class type).
ClassCastException: If the objects are incompatible, a ClassCastException is thrown.
Example of upcasting and downcasting:
Upcasting: Converting a child class to a parent class (done automatically).
Downcasting: Converting a parent class to a child class (requires explicit casting).
Casting Between Primitive Data Types
Automatic (Implicit) Casting:

When converting from a smaller primitive type to a larger one (e.g., int to long).
Java does this conversion automatically.
Manual (Explicit) Casting:

When converting from a larger primitive type to a smaller one (e.g., double to int).
The programmer must manually instruct Java on how to perform this conversion.
Example of Implicit Casting:
java
Copy code
int intValue = 100;
long longValue = intValue;  // Implicit casting (int to long)
Example of Explicit Casting:
java
Copy code
double doubleValue = 99.99;
int intValue = (int) doubleValue;  // Explicit casting (double to int), decimal part is truncated
Important Notes on Type Casting:
Loss of Data: Explicit casting can result in the loss of data. For instance, when casting from a double to an int, the decimal part will be discarded.
Overflow or Underflow: If you narrow a type and the value is too large or small for the target type, it may overflow or underflow (e.g., casting a large long to an int).
ClassCastException: When downcasting objects (casting from a parent class to a subclass), if the object is not an instance of the subclass, it will throw a ClassCastException.
Wrapper Classes: Type casting can also occur between primitive data types and their wrapper classes (Integer, Double, Character, etc.). Java supports auto-boxing (automatic conversion from primitive to wrapper class) and unboxing (conversion from wrapper class to primitive).
Best Practices for Type Casting:
Use Implicit Casting When Possible: Java automatically handles widening conversions (e.g., int to double), so it’s best to let Java do it without needing to manually intervene.
Avoid Narrowing Unless Necessary: Narrowing conversions should only be used when you are sure about the data and the potential loss of information is acceptable.
Check Compatibility: When working with object references, always ensure that the type you're casting to is compatible with the object's actual type. Otherwise, you may encounter a ClassCastException.
Handle Exceptions: When performing downcasting, always use instanceof to check the type of an object before casting it to avoid runtime errors.
Summary:
Implicit casting (widening) allows safe conversion from smaller to larger types without data loss.
Explicit casting (narrowing) requires programmer intervention to avoid potential data loss or overflow.
Type casting in Java is essential when working with different types of data, but it's important to manage it carefully to prevent errors or data truncation.
 */