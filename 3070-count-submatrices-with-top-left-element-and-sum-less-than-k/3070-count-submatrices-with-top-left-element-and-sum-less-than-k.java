class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row=grid.length;
        int col = grid[0].length;
        int[][] prefix = new int[row+1][col+1];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                prefix[i+1][j+1]= grid[i][j]+prefix[i+1][j]+prefix[i][j+1]-prefix[i][j];
                if(prefix[i+1][j+1]<=k){
                    count++;
                }
            }
        }
        return count;
    }
}