class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        int count = s.length();
        while(count > 0){
            char first = s.charAt(0);
            s = s.substring(1) + first;
            if(s.equals(goal)){
                return true;
            }
            count --;
        }
        return false;
    }
}