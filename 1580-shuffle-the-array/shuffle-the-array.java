class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i = 0;
        for(int j=0; j<n; j++){
            ans[i] = nums[j];
            i++;
            ans[i] = nums[j+n];
            i++;
        }
        return ans;
    }
}