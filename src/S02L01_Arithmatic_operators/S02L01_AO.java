package S02L01_Arithmatic_operators;

public class S02L01_AO_P_1 {
    public static void main(String[] args) {

        // Declare and initialize variables
        int a = 15;
        int b = 4;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;  // Integer division
        System.out.println("Quotient: " + quotient);

        // Modulus (Remainder)
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // Floating-point arithmetic
        double x = 15.0;
        double y = 4.0;

        double sumDouble = x + y;
        double differenceDouble = x - y;
        double productDouble = x * y;
        double quotientDouble = x / y;

        System.out.println("Sum (double): " + sumDouble);
        System.out.println("Difference (double): " + differenceDouble);
        System.out.println("Product (double): " + productDouble);
        System.out.println("Quotient (double): " + quotientDouble);
    }
}
