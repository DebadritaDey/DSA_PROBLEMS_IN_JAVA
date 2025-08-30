class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "){
            return true;
        }
        String anss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ch = anss.toCharArray();
        int len = ch.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (ch[i] == ch[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }
}