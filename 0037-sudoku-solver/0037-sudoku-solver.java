class Solution {
    public void solveSudoku(char[][] board) {
        char[][] grid = new char[9][9];
        solve(board,grid,0,0);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=grid[i][j];
            }
        }
    }

    public void solve(char[][] board, char[][] grid, int r, int c){
        if(r==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    grid[i][j]=board[i][j];
                }
            }
            return;
        }
        if(board[r][c]!='.'){
            if(c!=8){
                solve(board,grid,r,c+1);
            }else{
                solve(board,grid,r+1,0);
            }
        }else{

            for(char ch='1';ch<='9';ch++){
                if(isValid(ch,board,r,c)){
                    board[r][c]=ch;
                    if(c!=8) solve(board,grid,r,c+1);
                    else solve(board,grid,r+1,0);
                    board[r][c]='.';
                }
            }
        }
    }

    public boolean isValid(char ch, char[][] board, int r, int c){
        //row
        for(int i=0;i<9;i++){
            if(board[r][i]==ch) return false;
        }

        //col
        for(int j =0;j<9;j++){
            if(board[j][c]==ch) return false;
        }

        //3*3
       
        int i=r/3;
        int j=c/3;
        i*=3;
        j*=3;
        for(int row=i;row<i+3;row++){
            for(int col=j;col<j+3;col++){
            if(board[row][col]==ch){
                return false;
            }
            }
        }
        return true;
    }
}