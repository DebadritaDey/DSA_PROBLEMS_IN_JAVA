class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, the answer is 0 by definition.
        if (needle.isEmpty()) {
            return 0;
        }

        // We only need to check starting points in haystack where
        // the remaining string is at least as long as the needle.
        int hLen = haystack.length();
        int nLen = needle.length();
        
        for (int i = 0; i <= hLen - nLen; i++) {
            // Assume we have found a match until proven otherwise.
            boolean match = true;
            for (int j = 0; j < nLen; j++) {
                // Check if the characters in the current "window" of haystack
                // match the characters in the needle.
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    // Mismatch found, break the inner loop.
                    match = false;
                    break;
                }
            }
            
            // If the inner loop completed without a mismatch, we found the substring.
            if (match) {
                return i; // Return the starting index.
            }
        }
        
        // If the outer loop finishes without returning, needle was not found.
        return -1;
    }
}