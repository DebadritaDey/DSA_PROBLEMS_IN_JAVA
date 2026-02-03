class Solution {
    public int maximumCount(int[] nums) {
        int pi = 0;
        int ni = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                ni += 1;
            }
            if(nums[i]>0){
                pi += 1;
            }
        }
        if(pi>ni){
            return pi;
        }
        return ni;
    }
}