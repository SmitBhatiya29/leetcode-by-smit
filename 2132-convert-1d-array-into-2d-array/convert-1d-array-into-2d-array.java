class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length > (m*n) || original.length != (m*n)){
            return new int[][]{};
        }
        int[][] ans = new int[m][n];
        
        int l = 0;
        for(int i = 0; i < m;i++){
           for(int j = 0; j < n; j++){
                ans[i][j] = original[l];
                l++;
           }
        }
        return ans;
    }
}