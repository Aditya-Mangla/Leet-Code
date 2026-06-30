class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int st =0;
        int end = numbers.length-1;
        while(st<end){
            if(numbers[st] + numbers[end] == target){
                arr[0] = st+1;
                arr[1] = end+1;
                return arr;

            }else if(numbers[st] + numbers[end] < target){
                st++;
            }else{
                end--;
            }

        }
        return arr;
    }
}