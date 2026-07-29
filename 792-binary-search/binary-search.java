class Solution {
    public int search(int[] nums, int target) {
        
        return binary(0,nums.length-1, nums , target);
    }
    public static int binary(int st , int end , int[] nums, int target){
        if(st>end){
            return -1;
        }
        int mid = st + (end - st)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target) return binary(st , mid-1 , nums , target);
        else {return binary(mid+1,end,nums,target);}
        
    }
}