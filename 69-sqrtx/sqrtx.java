class Solution {
    public int mySqrt(int x) {
        if (x < 2) { // Handle 0 and 1 separately
            return x;
        }

        long start = 1; // Use long for start and end to prevent mid*mid overflow
        long end = x / 2; // Optimization: sqrt(x) will never be greater than x/2 for x > 1
        int ans = 0; // Store the potential answer

        while (start <= end) { // Use <= to consider single-element range
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = (int) mid; // This mid is a potential answer, store it
                start = mid + 1; // Try a larger number
            } else { // mid * mid > x
                end = mid - 1; // Try a smaller number
            }
        }
        return ans; // Return the last valid 'ans' found
    }
}