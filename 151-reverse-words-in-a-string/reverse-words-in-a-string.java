class Solution {
    public String reverseWords(String s) {
       String[] ansarray = s.trim().split("\\s+");
       int i = 0;
       int j = ansarray.length -1;
       while(j>i){
          String temp = ansarray[i];
          ansarray[i] = ansarray[j];
          ansarray[j] = temp;
          i++;
          j--;
       }
        return String.join(" ", ansarray);
    }
}