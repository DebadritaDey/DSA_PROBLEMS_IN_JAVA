class Solution {
    public int majorityElement(int[] nums) {
        int k = nums.length/2;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            int arr = nums[i];
            for(int j=0; j<nums.length; j++){
                if(nums[j] == nums[i]){
                    count+= 1;
                    if(count>k){
                        return arr;
                    }
                }
            }
        }
        return -1;
    }
}