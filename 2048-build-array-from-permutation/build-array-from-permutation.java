class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<nums.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }
}