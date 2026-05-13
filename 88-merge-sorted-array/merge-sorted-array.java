class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n;
        if(size == 1){
            if(m<n){
                nums1[0] = nums2[0];
            }
        }
        int j = 0;
        for(int i = m; i<size; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        
    }
}