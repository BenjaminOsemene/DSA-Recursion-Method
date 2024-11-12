public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        // Base condition
        if (decimal == 0) {
            return "";
        }
        
        // Recursive flow
        int quotient = decimal / 2;
        int remainder = decimal % 2;
        return decimalToBinary(quotient) + remainder;
    }

    public static void main(String[] args) {
        int decimal = 13;
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal " + decimal + " in binary is: " + binary);
        
        // Testing the recursive flow
        System.out.println("\nConversion flow:");
        testFlow(decimal);
    }

    public static void testFlow(int decimal) {
        if (decimal == 0) {
            return;
        }
        int quotient = decimal / 2;
        int remainder = decimal % 2;
        System.out.println(decimal + "/2 Quotient:" + quotient + ", Remainder:" + remainder);
        testFlow(quotient);
    }
}