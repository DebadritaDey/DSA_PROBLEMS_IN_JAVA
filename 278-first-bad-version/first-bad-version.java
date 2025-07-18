/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // int bad = 0;
        // for(int i=1; i<=n;i++){
        //     boolean ans = isBadVersion(i);
        //     if(ans==true){
        //         bad = i;
        //         break; 
        //     }
        // }
        // return bad;
        int l = 1;
        int r = n;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isBadVersion(mid)==false){
                l = mid+1;
            }
            else if(isBadVersion(mid)==true){
                r = mid-1;
            }
        }
        return l;
    }
}