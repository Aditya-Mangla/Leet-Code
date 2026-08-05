class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String con = s+s;
        return con.contains(goal);
    }
}