class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==1 && n==0 ){
            nums1= nums1;
        }
        for(int i=0; i<n; i++){
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
        
    }
}