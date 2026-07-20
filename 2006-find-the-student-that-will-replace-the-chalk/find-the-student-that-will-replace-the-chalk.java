class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long chalkSum = 0;

        for(int i : chalk)chalkSum += i;

        long rem = k%chalkSum;

        for(int i = 0; i < chalk.length; i++){
            if(chalk[i] > rem)return i;

            rem -= chalk[i];
        }
        return -1;

    }
}