class Solution {
    public int maxProductPath(int[][] grid) {
        int r=grid.length;
        int c= grid[0].length;
        long[][] max = new long[r][c];
        long[][] min = new long[r][c];

        max[0][0] = grid[0][0];
        min[0][0] = grid[0][0];

        for(int i=1;i<r;i++){
            max[i][0]= max[i-1][0]*grid[i][0];
            min[i][0]=max[i][0];
        }

        for(int j=1;j<c;j++){
            max[0][j]=max[0][j-1]*grid[0][j];
            min[0][j]=max[0][j];
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                long a = max[i-1][j]*grid[i][j];
                long b = min[i-1][j]*grid[i][j];
                long c1 = max[i][j-1]*grid[i][j];
                long d = min[i][j-1]*grid[i][j];


                max[i][j]=Math.max(Math.max(a,b),Math.max(c1,d));
                min[i][j]=Math.min(Math.min(a,b),Math.min(c1,d));
            }
        }

        long ans=max[r-1][c-1];
        if(ans<0) return -1;
        return (int)(ans%1000000007);
    }
}