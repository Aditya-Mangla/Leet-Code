class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        
        int len =0;
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            if(ch1 == ' '){
                if(i == s.length()-1){
                    return len;
                }else{
                    len = 0;
                }
            }else{
                len++;
            }
        }  
        return len; 
    }
}