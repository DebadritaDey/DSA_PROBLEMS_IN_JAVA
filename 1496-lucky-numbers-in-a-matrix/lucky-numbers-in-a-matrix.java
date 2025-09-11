class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> minRows = new HashSet<>();
        HashSet<Integer> maxcols = new HashSet<>();
        for(int i=0; i<rows; i++){
            int minval = matrix[i][0];
            for(int j=0; j<cols; j++){
                minval = Math.min(matrix[i][j], minval);
            }
            //store the min rows in the set
            minRows.add(minval);
        }

        for(int i=0; i<cols; i++){
            int maxval = matrix[0][i];
            for(int j=0; j<rows; j++){
                maxval = Math.max(matrix[j][i], maxval);
            }
            //store the max rows in the set
            maxcols.add(maxval);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(minRows.contains(matrix[i][j]) && maxcols.contains(matrix[i][j])){
                    res.add(matrix[i][j]);
                }
            }
        }

        return res;
    }
}