class Solution {
    public long gcdSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] prefixGcd = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) {
                max = nums[i];
            }
            prefixGcd[i] = gcd(nums[i] , max);

        }
        Arrays.sort(prefixGcd);
        long sum =0;
        for(int i=0;i<nums.length/2;i++){
            sum += gcd(prefixGcd[i] , prefixGcd[nums.length-1-i]);
        }

        return sum;
    }
    public static int gcd(int a, int b) {
    // Handle negative numbers safely
    a = Math.abs(a);
    b = Math.abs(b);
    
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

}