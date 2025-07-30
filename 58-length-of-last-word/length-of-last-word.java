class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        int a = arr.length;
        String ans = arr[a-1];
        int anslen = ans.length();
        return anslen;
        
    }
}