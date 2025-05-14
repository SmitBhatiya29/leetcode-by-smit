class Solution {
    public int check(int[][] board,int i , int j ,int n,int m){
                    int live = 0;
                    if(i-1 >= 0 && j-1 >= 0){
                        if(board[i-1][j-1] == 1){
                            live++;
                        }
                    }
                    if(i-1 >= 0){
                        if(board[i-1][j] == 1){
                            live++;
                        }
                    }
                    if(i-1 >= 0 && j+1 < m ){
                        if(board[i-1][j+1] == 1){
                            live++;
                        }
                    }
                    if(j-1 >= 0){
                        if(board[i][j-1] == 1){
                            live++;
                        }
                    }
                    if(j+1 < m ){
                        if(board[i][j+1] == 1){
                            live++;
                        }
                    }
                    if(i+1 < n && j - 1 >=0){
                        if(board[i+1][j-1] == 1){
                            live++;
                        }
                    }
                    if(i+1 < n){
                        if(board[i+1][j] == 1){
                            live++;
                        }
                    }
                    if(i+1 < n && j + 1 < m){
                        if(board[i+1][j+1] == 1){
                            live++;
                        }
                    }
                    return live;    
    }
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int ans[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j =0; j < m ; j++){
                if(board[i][j] == 1){
                    int live = check(board,i,j,n,m);

                    if(live < 2){
                        ans[i][j] = 0;
                    }else if(live == 2 || live == 3){
                        ans[i][j] = 1;
                    }else{
                        ans[i][j] = 0;
                    }
                }else{
                    int live = check(board,i,j,n,m);
                    if(live == 3){
                        ans[i][j] = 1;
                    }else{
                        ans[i][j] =0;
                    }
                }
            }
        }
        for(int i =0; i< n;i++){
            for(int j =0; j< m ; j++){
                board[i][j] = ans[i][j];
            }
        }
        return;
    }
}