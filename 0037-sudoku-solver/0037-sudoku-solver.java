class Solution {
    public void solve(char[][] board, int row , int col, char[][] grid){
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    grid[i][j]=board[i][j];
                }
            }
            return;
        }


        if(board[row][col]!='.'){
        if(col!=8){
            solve(board,row,col+1,grid);
        }else{
            solve(board,row+1,0,grid);
        }
        }



        else{
            for(char ch='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col]=ch;
            if(col!=8) solve(board,row,col+1,grid);
            else solve(board,row+1,0,grid);
            board[row][col]='.';
                }
                }
        }


         
    }

    private boolean isValid(char[][] board, int row, int col, char num){
        //row check
      
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }

        //col check
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }

        //check 3*3 ki grid
        int i=0;
        int j=0;
        i=row/3;
        j=col/3;
        i*=3;
        j*=3;
        for(int k = i;k<i+3;k++){
            for(int l=j;l<j+3;l++){
                if(board[k][l]==num) return false;
            }
        }
        return true;

    }


    public void solveSudoku(char[][] board) {
        char[][] grid = new char[9][9];
        solve(board,0 ,0,grid);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=grid[i][j];
            }
        }
    }
}