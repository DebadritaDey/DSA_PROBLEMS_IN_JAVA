class Solution {
    public double myPow(double x, int n) {
        if (x == 1.0) {
            return 1.0;
        }
        if (x == 0.0) {
            if (n == 0) {
                return 1.0; // 0^0 is usually 1
            } else if (n < 0) {
                // For x=0 and n<0, it's 1/0, which is undefined or infinity.
                // Java's double division will result in Infinity.
                return Double.POSITIVE_INFINITY;
            } else {
                return 0.0; // 0^n for n>0 is 0
            }
        }

        // Handle the case where n is Integer.MIN_VALUE.
        // Convert n to a long to avoid overflow when taking its absolute value.
        long N = n;
        double ans = 1.0;

        // If N is negative, make it positive and handle the reciprocal later.
        if (N < 0) {
            N = -N;
            x = 1 / x; // Equivalent to calculating 1/x^|n|
        }

        // Exponentiation by squaring (binary exponentiation)
        while (N > 0) {
            if ((N % 2) == 1) { // If N is odd
                ans *= x;
            }
            x *= x; // Square x
            N /= 2; // Halve N
        }

        return ans;
    }
}