class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> anss = new ArrayList<>();
        for(int i = 0; i<candies.length; i++){
           int cd = candies[i] + extraCandies;
           if(findmax(cd, candies)){
            anss.add(true);
           }else{
            anss.add(false);
           }
        }
        return anss;

    }
    public static boolean findmax(int a, int[] arr){
        int max = a;
        boolean ans = true;
       for(int i =0; i <arr.length; i++){
          if(arr[i] > max){
            max = arr[i];
          }
       }
       if(max != a){
        ans = false;
       }
       return ans;

    }
}