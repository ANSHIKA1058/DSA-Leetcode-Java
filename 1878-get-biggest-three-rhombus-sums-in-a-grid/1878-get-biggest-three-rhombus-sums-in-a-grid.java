class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                set.add(grid[i][j]);

                if(set.size()>3){
                    set.pollFirst();
                }

                int maxSize =Math.min(Math.min(i,row-1-i),Math.min(j,col-1-j));
                for(int k=1;k<=maxSize;k++){
                    int sum=0;
                   
                    //top->right
                    for(int x=0;x<k;x++){
                        sum+=grid[i-k+x][j+x];
                    }
                    //right->bottom
                    for(int x=0;x<k;x++){
                        sum+=grid[i+x][j+k-x];
                    }
                    //bottom->left
                    for(int x=0;x<k;x++){
                        sum+=grid[i+k-x][j-x];
                    }//left->top
                    for(int x=0;x<k;x++){
                        sum+=grid[i-x][j-k+x];
                    }
                    set.add(sum);
                    if(set.size()>3){
                        set.pollFirst();
                    }
                }
            }
        }
        int[] res = new int[set.size()];
        int idx= set.size()-1;
        for(int v:set){
            res[idx--]=v;
        }
        return res;
    }
}