package S01L03_Primitive_DataType;

public class sample {
    public static void main(String[] args) {

        // byte: 1 byte
        byte byteMax = 127;        // Maximum value for a byte
        byte byteMin = -128;       // Minimum value for a byte

        // short: 2 bytes
        short shortMax = 32767;    // Maximum value for a short
        short shortMin = -32768;   // Minimum value for a short

        // int: 4 bytes
        int intMax = 2147483647;   // Maximum value for an int
        int intMin = -2147483648;  // Minimum value for an int

        // long: 8 bytes
        long longMax = 9223372036854775807L; // Maximum value for a long
        long longMin = -9223372036854775808L; // Minimum value for a long

        // float: 4 bytes
        float floatMax = 3.4028235E38F;  // Maximum positive value for a float
        float floatMin = -3.4028235E38F; // Minimum negative value for a float

        // double: 8 bytes
        double doubleMax = 1.7976931348623157E308; // Maximum positive value for a double
        double doubleMin = -1.7976931348623157E308; // Minimum negative value for a double

        // char: 2 bytes
        char charMax = '\uFFFF'; // Maximum value for a char (Unicode character)
        char charMin = '\u0000'; // Minimum value for a char (null character)

        // boolean: 1 byte (though it's not precisely defined to be a byte in Java)
        boolean booleanTrue = true;  // True value for a boolean
        boolean booleanFalse = false; // False value for a boolean
    }
}
