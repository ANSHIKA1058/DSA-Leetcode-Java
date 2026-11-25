class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] vis = new boolean[n];
        dfs(source,adj,vis);
        return vis[destination];

    }
    public void dfs(int source,List<List<Integer>> adj,boolean[] vis){
        vis[source]=true;
        for(int ne:adj.get(source)){
            if(!vis[ne]){
                dfs(ne,adj,vis);
            }
        }
    }

}