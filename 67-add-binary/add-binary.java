import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
          
           return addBinaryStrings(a, b);
    }
    public static String addBinaryStrings(String binary1, String binary2) {
        // Parse both strings as base-2 numbers
        BigInteger num1 = new BigInteger(binary1, 2);
        BigInteger num2 = new BigInteger(binary2, 2);
        
        // Add them together
        BigInteger sum = num1.add(num2);
        
        // Return the result formatted as a binary string
        return sum.toString(2);
    }
}