class Solution {
    public void rotate(int[][] matrix) {
        matrixtranspost(matrix);
        for(int i=0; i<matrix.length; i++){
            rortatearray(matrix[i]);
        }
        
    }

    public void matrixtranspost(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rortatearray(int[] arr){
        int n = arr.length;
        int j = arr.length -1;
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}