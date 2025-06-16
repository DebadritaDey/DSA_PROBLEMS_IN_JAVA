class Solution {
    public int maximumDifference(int[] nums) {
        int maxDifference = -1;
        int minElement = nums[0]; // Initialize minElement with the first element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minElement) {
                maxDifference = Math.max(maxDifference, nums[i] - minElement);
            } else {
                // If nums[i] is smaller than or equal to current minElement,
                // it becomes the new minimum element for future comparisons.
                minElement = nums[i];
            }
        }
        return maxDifference;
    }
}