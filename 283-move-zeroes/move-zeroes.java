class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer for placing non-zero elements

        // First pass: Move all non-zero elements to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Second pass: Fill the remaining elements with zeroes
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}