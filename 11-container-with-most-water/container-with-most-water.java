class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j =height.length-1;
        int currArea=0;
        int maxArea = 0;
    while(i<j){
         if(height[i]<height[j]){
                currArea=(j-i)*height[i];
                maxArea = Math.max(currArea, maxArea);
                i++;
             }else{
                currArea=(j-i)*height[j];
                maxArea = Math.max(currArea, maxArea);
                j--;
             }
    }
        
       
        return maxArea;
    }
}