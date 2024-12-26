public class charASCIIvalue14 {
    public static void main(String[] args) {
        // Declare a character variable and assign it a value
        char ch = 'A'; // 'A' is the character for which we need to find the ASCII value

        // Implicit type casting: char is automatically converted to int to store its ASCII value
        int ascii = ch; // The ASCII value of 'A' is stored in 'ascii'

        // Print the ASCII value of 'A'
        System.out.println("ASCII value of " + ch + " is " + ascii); // Output: ASCII value of A is 65
        
        // Additional code to find the ASCII values of a range of characters (A to Z)
        System.out.println("ASCII values for characters A to Z:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("ASCII value of " + c + " is " + (int) c); // Print ASCII for each character from A to Z
        }

        // Additional part to print ASCII values for lowercase letters
        System.out.println("\nASCII values for lowercase characters a to z:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("ASCII value of " + c + " is " + (int) c); // Print ASCII for each character from a to z
        }
    }
}/*

ASCII Value Notes in Short
What is ASCII?
ASCII (American Standard Code for Information Interchange) is a character encoding standard that represents text using numeric codes (0–127).
It defines values for letters, digits, punctuation, and control characters.
Key ASCII Values:
Uppercase Letters:
A = 65, B = 66, ..., Z = 90
Lowercase Letters:
a = 97, b = 98, ..., z = 122
Digits:
0 = 48, 1 = 49, ..., 9 = 57
Special Symbols:
! = 33, @ = 64, # = 35, $, %, &, *, etc.
Getting ASCII Values in Java:
Implicit Typecasting:
When a char is assigned to an int, it is automatically converted to its ASCII value.
Example:

java
Copy code
char ch = 'A';  
int ascii = ch;  // 65
Explicit Typecasting:
You can also explicitly cast a char to an int using (int).
Example:

java
Copy code
char ch = 'A';  
int ascii = (int) ch;  // 65
ASCII Example in Java:
java
Copy code
public class ASCIIExample {
    public static void main(String[] args) {
        char ch = 'A';  
        int ascii = ch;  
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
    }
}
Loops for Printing ASCII Values:
Uppercase Letters:
java
Copy code
for (char c = 'A'; c <= 'Z'; c++) {
    System.out.println(c + ": " + (int) c);  
}
Lowercase Letters:
java
Copy code
for (char c = 'a'; c <= 'z'; c++) {
    System.out.println(c + ": " + (int) c);  
}
Important Notes:
Range: ASCII values range from 0 to 127.
Character Data Type: Java uses Unicode (16-bit) for characters, but the first 128 Unicode characters correspond to ASCII.
Typecasting: Implicit typecasting automatically converts a char to an int. Explicit typecasting uses (int) to get the ASCII value.
Common Uses of ASCII:
File encoding: Storing and reading text in files.
Network protocols: Representing text in communication systems.
String manipulation: Comparing and processing characters based on their ASCII values.*/




/*
 * Famous ASCII Values Important for Interview
Here’s a list of commonly asked ASCII values that are often useful for interviews:

Control Characters (0-31)
0: NULL (End of string in some cases)
9: Horizontal Tab (TAB)
10: New Line (Line Feed or LF)
13: Carriage Return (CR)
Digits (0-9)
48: '0'
49: '1'
50: '2'
51: '3'
52: '4'
53: '5'
54: '6'
55: '7'
56: '8'
57: '9'
Uppercase Letters (A-Z)
65: 'A'
66: 'B'
67: 'C'
68: 'D'
69: 'E'
70: 'F'
71: 'G'
72: 'H'
73: 'I'
74: 'J'
75: 'K'
76: 'L'
77: 'M'
78: 'N'
79: 'O'
80: 'P'
81: 'Q'
82: 'R'
83: 'S'
84: 'T'
85: 'U'
86: 'V'
87: 'W'
88: 'X'
89: 'Y'
90: 'Z'
Lowercase Letters (a-z)
97: 'a'
98: 'b'
99: 'c'
100: 'd'
101: 'e'
102: 'f'
103: 'g'
104: 'h'
105: 'i'
106: 'j'
107: 'k'
108: 'l'
109: 'm'
110: 'n'
111: 'o'
112: 'p'
113: 'q'
114: 'r'
115: 's'
116: 't'
117: 'u'
118: 'v'
119: 'w'
120: 'x'
121: 'y'
122: 'z'
Special Characters
32: Space ( )
33: Exclamation mark (!)
34: Double quotes (")
35: Hash/Pound (#)
36: Dollar sign ($)
37: Percent (%)
38: Ampersand (&)
40: Left Parenthesis (()
41: Right Parenthesis ())
42: Asterisk (*)
43: Plus (+)
44: Comma (,)
46: Period (.)
47: Slash (/)
58: Colon (:)
59: Semicolon (;)
60: Less than (<)
61: Equals (=)
62: Greater than (>)
63: Question mark (?)
91: Left square bracket ([)
92: Backslash (\)
93: Right square bracket (])
94: Caret (^)
95: Underscore (_)
123: Left curly brace ({)
124: Pipe (|)
125: Right curly brace (})
126: Tilde (~)
Why These ASCII Values Matter in Interviews:
Character Encoding: Understanding ASCII values is crucial when dealing with character encoding, data transfer, and memory management.
String Manipulation: Often used in string manipulation problems (e.g., determining the difference between uppercase and lowercase characters, comparing characters, or converting characters).
Input/Output Handling: ASCII control characters are vital when working with input/output handling, especially in text-based environments.
Common Algorithms: Many algorithms use ASCII values for sorting or character-based computations (e.g., checking if a string contains only digits or letters).
Important Takeaways:
ASCII is the foundation for character encoding in many programming languages, including Java.
ASCII values allow easy comparison and manipulation of characters.
Interview Tip: Be prepared to explain or use ASCII values in problems involving strings, character encoding, or input validation.
 */
