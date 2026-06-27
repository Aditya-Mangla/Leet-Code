class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
       int slow = 0;
       int fast =1;
       int ans = 0;
       while(fast <nums.length){
        if(nums[slow] == nums[fast]){
            ans = nums[slow];
            return nums[slow];
            
        }
        slow++;
        fast++;
       }
    return ans;

    }
}