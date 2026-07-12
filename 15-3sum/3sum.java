class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> nestedList = new ArrayList<>();
        // List<Integer> subList = new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1] ) 
                continue;
           
            while(j<k){
                int currSum = nums[i] + nums[j] + nums[k];
                if(currSum ==0){
                    
                    nestedList.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }else if(currSum > 0){
                    k--;
                }else{
                    j++;
                }
            }

        }
        
         
         return nestedList;
    }
}