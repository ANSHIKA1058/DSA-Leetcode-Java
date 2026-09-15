class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] boards = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boards[i][j]='.';
            }
        }
        nqueen(ans,boards,0);
        return ans;
    }
    public void nqueen(List<List<String>> ans, char[][] boards,int row){
        int n = boards.length;
        List<String> list = new ArrayList<>();
        if(row==n){
            for(int i=0;i<n;i++){
                String str = "";
                for(int j=0;j<n;j++){
                    str+=boards[i][j];
                }
                list.add(str);
            }
            ans.add(list);
            return;
        }

        for(int j=0;j<n;j++){
            if(isSafe(boards,row,j)){
                boards[row][j]='Q';
                nqueen(ans,boards,row+1);
                boards[row][j]='.';
            }
        }
    }
    public boolean isSafe(char[][] boards,int row, int col){
        int n= boards.length;

        //---------->col
        for(int j=0;j<n;j++){
            if(boards[row][j]=='Q') return false;
        }
        // row
        for(int i=0;i<n;i++){
            if(boards[i][col]=='Q') return false;
        }
        //ne 
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(boards[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        //nw
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(boards[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        //se
        i=row;
        j=col;
        while(i<n && j<n){
            if(boards[i][j]=='Q'){
                return false;
            }
            i++;
            j++;
        }
        //sw
    i=row;
    j=col;
    while(i<n && j>=0){
        if(boards[i][j]=='Q'){
            return false;
        }
        i++;
        j--;
    }
    return true;

    }
}