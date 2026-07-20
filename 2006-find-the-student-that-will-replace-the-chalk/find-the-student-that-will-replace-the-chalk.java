class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i =0;
        while(k>0){
            if(i==chalk.length){
                i =0;
            }
            
            if(k >= chalk[i]){
                k -= chalk[i++];
            }else{
                return i;
            }
        }
    if(i == chalk.length) return 0;
    return i;
    }
}