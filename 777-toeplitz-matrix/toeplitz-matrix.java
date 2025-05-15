class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int row = n;
        int col = matrix[0].length; 
        for(int i = 0 ; i < col; i++)
        {
            int check = matrix[0][i];
            int k = 0; // row
            int l = i; //col
            while(k < row && l < col){
                if(matrix[k][l] != check){
                    return false;
                }
                k++;
                l++;
            }
        }
        for(int i =0 ; i < row; i++){
            int check = matrix[i][0];
            int k = i;
            int l = 0;
            while(k < row && l < col){
                if(check != matrix[k][l]){
                    return false;
                }
                k++;
                l++;
            }
        }
        return true;
    }
}