class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int perimeter=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    perimeter+=4;
                    //uper
                    if(i>0 && grid[i-1][j]==1) perimeter--;
                    //lower
                    if(i<row-1 && grid[i+1][j]==1) perimeter--;
                    //left
                    if(j>0 && grid[i][j-1]==1) perimeter--;
                    //right
                    if(j<col-1 && grid[i][j+1]==1) perimeter--;
                }
            }
        }
        return perimeter;
        
    }
}