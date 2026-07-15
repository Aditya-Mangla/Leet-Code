import java.math.BigInteger;
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count =1;
        int sumOdd =0 , sumEven =0;

        while(count<=2*n){
            
            if(count%2==0){
                sumEven+=count;
                count++;
            }else{
                sumOdd+=count;
                count++;
            }
        }
        BigInteger num1 = BigInteger.valueOf(sumOdd);
        BigInteger num2 = BigInteger.valueOf(sumEven);
        
        // Built-in gcd function
        BigInteger gcd = num1.gcd(num2); 
        return gcd.intValue(); 
        

    }
}