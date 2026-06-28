import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
         for (int i = 0; i < cost.length / 2; i++) {
            int temp = cost[i];
            cost[i] = cost[cost.length - 1 - i];
            cost[cost.length - 1 - i] = temp;
        }
        int j =1;
        int ans =0;
        for(int i=0;i<cost.length;i++){
            
            if(j<3){
                ans+=cost[i];
                j++;
            }else{
                j=1;
            }
            
        }
        return ans;
    }
}