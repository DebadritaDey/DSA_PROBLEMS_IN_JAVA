class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 0; // This will be the count of elements not equal to val, and also the next position to place such an element.

        // Iterate through the array with 'j'
        for (int j = 0; j < nums.length; j++) {
            // If the current element (nums[j]) is NOT the value to remove
            if (nums[j] != val) {
                // Place it at the 'k' position
                nums[k] = nums[j];
                // Increment 'k' to prepare for the next non-val element
                k++;
            }
        }

        // 'k' now holds the number of elements that are not 'val',
        // which is effectively the new length of the array.
        return k;
    }

    // The swap method is not needed for this optimized approach.
    // public void swap(int a, int b){
    //     int temp = a;
    //     a=b;
    //     b=temp;
    // }
}