class Solution {
    public int findGCD(int[] nums) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>high){
                high = nums[i];
            }
            if(nums[i]<low){
                low = nums[i];
            }

            
        }

return findGCD(low , high);


    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}