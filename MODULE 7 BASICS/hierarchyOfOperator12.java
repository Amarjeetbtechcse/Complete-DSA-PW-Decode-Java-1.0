public class hierarchyOfOperator12 {
    public static void main(String[] args) {
        int a = 10, b = 5, result;

        // 1. Postfix Operator (Highest Precedence)
        result = a++; // Post-increment, 'a' is used first then incremented
        System.out.println("Post-increment result: " + result); // Output: 10, 'a' becomes 11 after this operation

        // 2. Unary Operators
        result = --b; // Pre-decrement, 'b' is decremented first then assigned
        System.out.println("Pre-decrement result: " + result); // Output: 4

        result = +a;  // Unary plus, returns the value of 'a' as is
        System.out.println("Unary plus result: " + result); // Output: 11

        result = -b;  // Unary minus, negates the value of 'b'
        System.out.println("Unary minus result: " + result); // Output: -4

        // 3. Multiplicative Operators
        result = a * b; // Multiplication
        System.out.println("Multiplication result: " + result); // Output: 11 * 4 = 44

        result = a / b; // Division (integer division)
        System.out.println("Division result: " + result); // Output: 11 / 4 = 2

        result = a % b; // Modulo (remainder)
        System.out.println("Modulo result: " + result); // Output: 11 % 4 = 3

        // 4. Additive Operators
        result = a + b; // Addition
        System.out.println("Addition result: " + result); // Output: 11 + 4 = 15

        result = a - b; // Subtraction
        System.out.println("Subtraction result: " + result); // Output: 11 - 4 = 7

        // 5. Relational Operators
        boolean isEqual = a == b; // Equality check
        System.out.println("Equality check result: " + isEqual); // Output: false

        boolean isGreater = a > b; // Greater than check
        System.out.println("Greater than check result: " + isGreater); // Output: true

        // 6. Logical AND Operator
        boolean andResult = (a > 5) && (b < 10); // Logical AND
        System.out.println("Logical AND result: " + andResult); // Output: true

        // 7. Assignment Operator
        a += 5; // Add and assign (a = a + 5)
        System.out.println("Add and assign result: " + a); // Output: 16

        // 8. Ternary Operator
        result = (a > b) ? a : b; // Ternary (if-else)
        System.out.println("Ternary operator result: " + result); // Output: 16

        // 9. Bitwise Operators
        int bitwiseAnd = a & b; // Bitwise AND
        System.out.println("Bitwise AND result: " + bitwiseAnd); // Output: 0

        int bitwiseOr = a | b; // Bitwise OR
        System.out.println("Bitwise OR result: " + bitwiseOr); // Output: 16

        int bitwiseXor = a ^ b; // Bitwise XOR
        System.out.println("Bitwise XOR result: " + bitwiseXor); // Output: 16

        // 10. Instanceof Operator
        String str = "Hello";
        boolean isString = str instanceof String; // Check if 'str' is an instance of String
        System.out.println("Instanceof result: " + isString); // Output: true
    }
}

/*
 * Hierarchy of Operators in Java (Operator Precedence)
In Java, operators are evaluated based on a hierarchy known as operator precedence. The higher the precedence of an operator, the earlier it is evaluated in an expression.

Here is the hierarchy of operators in Java, listed from the highest to the lowest precedence:

1. Postfix Operators (Highest Precedence)
expr++ (Post-increment)
expr-- (Post-decrement)
These operators are evaluated after the operand is used in an expression.

2. Unary Operators
++expr (Pre-increment)
--expr (Pre-decrement)
+ (Unary plus)
- (Unary minus)
~ (Bitwise NOT)
! (Logical NOT)
These operators are applied directly to a single operand.

3. Multiplicative Operators
* (Multiplication)
/ (Division)
% (Modulo)
These operators are used for basic arithmetic operations.

4. Additive Operators
+ (Addition)
- (Subtraction)
These operators are used for basic arithmetic operations, involving addition and subtraction.

5. Shift Operators
<< (Left shift)
>> (Right shift)
>>> (Unsigned right shift)
These operators shift bits to the left or right in binary representations.

6. Relational Operators
== (Equality)
!= (Not equal)
< (Less than)
<= (Less than or equal)
> (Greater than)
>= (Greater than or equal)
These operators compare two values or objects and return a boolean result (true or false).

7. Bitwise AND and Logical AND
& (Bitwise AND)
&& (Logical AND)
The bitwise AND operator works on individual bits, while the logical AND evaluates two boolean values.

8. Bitwise XOR and Logical OR
^ (Bitwise XOR)
| (Bitwise OR)
|| (Logical OR)
Bitwise XOR works on individual bits, while logical OR evaluates two boolean values.

9. Ternary Operator (Conditional)
? : (Ternary operator)
The ternary operator is used as a shorthand for if-else statements. It evaluates a condition and returns one of two values based on that condition.

10. Assignment Operators
= (Simple assignment)
+= (Add and assign)
-= (Subtract and assign)
*= (Multiply and assign)
/= (Divide and assign)
%= (Modulo and assign)
&= (Bitwise AND and assign)
^= (Bitwise XOR and assign)
|= (Bitwise OR and assign)
<<= (Left shift and assign)
>>= (Right shift and assign)
>>> (Unsigned right shift and assign)
These operators assign values to variables or modify them by performing an operation.

11. Lambda Operator
-> (Lambda expression)
Used in the context of lambda expressions to define anonymous functions.

12. Type Comparison Operator
instanceof (Type comparison)
Used to check whether an object is an instance of a specific class or implements an interface.

Operator Precedence Example:
In an expression, the operators with higher precedence are evaluated first. Consider the following expression:

java
Copy code
int result = 3 + 2 * 5;
Here:

* has higher precedence than +, so 2 * 5 is evaluated first (resulting in 10).
Then, 3 + 10 is evaluated (resulting in 13).
Thus, the final result is 13.

Operator Precedence Table:
Operator Type	Operators	Precedence Order
Postfix	expr++, expr--	1 (Highest)
Unary	++expr, --expr, +, -, ~, !	2
Multiplicative	*, /, %	3
Additive	+, -	4
Shift	<<, >>, >>>	5
Relational	==, !=, <, <=, >, >=	6
Bitwise AND	&	7
Logical AND	&&	8
Bitwise XOR	^	9
Bitwise OR	`	`
Logical OR	`	
Ternary	? :	12
Assignment	=, +=, -=, *=, /=, %= etc.	13 (Lowest)
Lambda	->	14
Type Comparison	instanceof	15
Important Notes:
Parentheses () have the highest precedence. They can be used to change the order of evaluation explicitly.
Left to Right Evaluation: Most operators are evaluated from left to right, except for ++, --, and ternary operators, which can be evaluated right to left in certain cases.
Associativity: This determines the order of operations when operators of the same precedence level are used. Most operators in Java are left-to-right associative, except for = (assignment), ?: (ternary operator), and some others that are right-to-left associative.
 */