import javax.sound.sampled.SourceDataLine;  // Importing the SourceDataLine class, but it's unused in this code

public class moreTypeCasting13 {
    public static void main(String[] args) {
        // 1. Implicit type casting (integer division before storing the result in a double variable)
        double x = 5 / 2;  // 5 and 2 are both integers, so the division results in 2 (integer division)
        System.out.println(x);  // Outputs: 2.0 (implicitly converted to double, but the result of the division is still 2.0)

        // 2. Explicit type casting (casting 5 to double before the division)
        double y = (double) 5 / 2;  // Here, 5 is explicitly cast to double, so the division results in 2.5
        System.out.println(y);  // Outputs: 2.5 (since 5.0 / 2 results in 2.5)
    }
}
