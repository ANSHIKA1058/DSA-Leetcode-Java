class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n =grid[0].length;


        int fresh=0;
        int min=0;

        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int[][] dir = {
            {-1,0},{1,0},{0,-1},{0,1}
        };

        while(!q.isEmpty() && fresh>0){
            int s=q.size();
            boolean rotten = false;
            for(int i=0;i<s;i++){
                int[] curr= q.poll();
                int r= curr[0];
                int c=curr[1];
                for(int[] d:dir){
                    int nr = r+d[0];
                    int nc = c+d[1];

                    if(nr>=0 && nc<n && nc>=0 && nr<m && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        rotten=true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            if(rotten){
                min++;
            }
        }
        return fresh==0?min:-1;
    }
}