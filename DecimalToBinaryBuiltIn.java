public class DecimalToBinaryBuiltIn {
    public static void main(String[] args) {
        int decimalNum = 17;
        
        // Use Java's built-in method
        String binaryStr = Integer.toBinaryString(decimalNum);
        
        System.out.println("Decimal: " + decimalNum);
        System.out.println("Binary: " + binaryStr);
    }
}
