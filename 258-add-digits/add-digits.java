class Solution {
    public int addDigits(int num) {
        int sum =0;
        int temp = num;
        while(num %10 != num){
            
            sum += temp%10;
            
            temp =  temp/10;
            if(temp==0){
                num = sum;
                sum =0;
                temp = num;
                
            }

            
        }
        return num;
    }
}