class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        String s = "";

        int i=0; int j = 0;
        while(i<a && j<b){
            s = s+ word1.charAt(i);
            s = s+word2.charAt(j);
            i++;
            j++;
        }
        if(b>a){
            String snew = word2.substring(a,b);
            s = s+snew;
        }
        if(a>b){
            String snew = word1.substring(b,a);
            s = s+snew;
        }

        return s;
    }
}