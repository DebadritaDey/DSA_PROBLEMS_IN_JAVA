class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        while(i<nums.length){
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    count += 1;
                }
            }
            ans[i] = count;
            i++;
        }
        return ans;
    }
}