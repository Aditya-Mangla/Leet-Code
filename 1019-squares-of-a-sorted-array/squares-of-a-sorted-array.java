class Solution {
    public int[] sortedSquares(int[] nums) {
        // initializing new Array
       int[] newL = new int[nums.length];
       // pointers for 2 pointers approach
       int i=0,j=nums.length-1;
    
       for(int k = nums.length-1;k>=0;k--){
        // nums Array is sorted then if abs value of nums[i] is bigger then it must come to end 
        if(Math.abs(nums[i]) > Math.abs(nums[j])){
            newL[k] = nums[i]*nums[i];
            i++;
        }else{
            newL[k] = nums[j] * nums[j];
            j--;
        }
       }
       return newL;
    }
}