class Solution {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count=0;
        boolean[] vis =new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                bfs(vis,adj,i);
            }
        }
        return count;
    }
    public void bfs(boolean[] vis,int[][] adj,int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
         vis[i]=true;
        while(!q.isEmpty()){
            int fr=q.poll();
            for(int j=0;j<adj.length;j++){
                if(adj[fr][j]==1 && !vis[j]){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }
    }
}