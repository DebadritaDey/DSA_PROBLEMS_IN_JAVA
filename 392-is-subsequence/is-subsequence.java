class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        while (j < t.length()) {
            // If characters match, advance the pointer for s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always advance the pointer for t
            j++;

            // If we have found all characters of s, we can stop early
            if (i == s.length()) {
                return true;
            }
        }

        // If we finish the loop and haven't found all chars of s, it's not a subsequence
        return false;
    }
}