class Solution {
    public String winningPlayer(int x, int y) {
        int turns =0;
        while(x>0 && y>=4){
            turns++;
            x--;
            y-=4;
        }
        if(turns%2==0){
            return "Bob";
        }else{
            return "Alice";
        }
          
    }
}