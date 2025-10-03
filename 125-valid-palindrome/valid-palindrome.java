class Solution {
    public boolean isPalindrome(String s) {
        if(s == " ") return true;
        char[] ch = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int i = 0;
        int n = ch.length;
        for(int j = ch.length -1; j>=0; j--){
            if(ch[j] != ch[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}