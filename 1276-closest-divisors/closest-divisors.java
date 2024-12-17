class Solution {
    public int[] closestDivisors(int num) {
        int[] result1 = findClosestDivisors(num + 1);
        int[] result2 = findClosestDivisors(num + 2);
        
        // Compare and return the pair with the smaller difference
        if (Math.abs(result1[0] - result1[1]) <= Math.abs(result2[0] - result2[1])) {
            return result1;
        } else {
            return result2;
        }
    }
    private int[] findClosestDivisors(int n) {
        // Start from the square root of n and move downwards
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i > 0; i--) {
            if (n % i == 0) {
                int j = n / i;
                return new int[]{i, j};
            }
        }
        return new int[]{1, n}; // Fallback case (though won't occur for valid inputs)
    }
}