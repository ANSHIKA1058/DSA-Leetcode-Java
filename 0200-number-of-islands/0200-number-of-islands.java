class Solution {

    public void dfs(int i,int j,boolean[][] vis,char[][] grid){
        int m =grid.length;
        int n =grid[0].length;
        vis[i][j]=true;
        //top
        if(i-1>=0 && grid[i-1][j]=='1' && !vis[i-1][j]){
            dfs(i-1,j,vis,grid);
        }
        //bottom
        if(i+1<m && grid[i+1][j]=='1' && !vis[i+1][j]){
            dfs(i+1,j,vis,grid);
        }

        //left
        if(j-1>=0 && grid[i][j-1]=='1' && !vis[i][j-1]){
            dfs(i,j-1,vis,grid);
        }
        //right

        if(j+1<n && grid[i][j+1]=='1' && !vis[i][j+1]){
            dfs(i,j+1,vis,grid);
        }
    }
    public int numIslands(char[][] grid) {
        int m =grid.length;
        int n = grid[0].length;

        boolean[][] vis=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
}