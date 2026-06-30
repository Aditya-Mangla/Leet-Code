class Solution {
    public void moveZeroes(int[] nums) {
        int st =0;
        int end =nums.length-1;
        while(st<end){
          if(nums[st] == 0){
            remove(nums , st , end);
            st=0;
            end--;
          } else{
            st++;
          }

        }
        
    }
    private void remove(int[] nums , int st, int end){
        for(int i=st;i<end;i++){
            nums[i] = nums[i+1];
        }  
        nums[end] =  0; 
     }
}