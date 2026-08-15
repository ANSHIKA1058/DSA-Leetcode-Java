class Solution {
    static boolean ans;
    public boolean canFinish(int num, int[][] pre) {
        ans =true;//no cycle=true
        List<List<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < num; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < pre.length; i++) {
            int a = pre[i][0];
            int b = pre[i][1];
            adj.get(b).add(a);
        }
        boolean[] vis = new boolean[num];
        boolean[] path = new boolean[num];
        for(int i=0;i<num;i++){
            if(!vis[i]){
                dfs(i,adj,vis,path);
            }
        }
        return ans;
        
    }
    public void dfs(int i,List<List<Integer>> adj, boolean[] vis,boolean[] path){
        vis[i]=true;
        path[i]=true;

        for(int ele:adj.get(i)){
            if(path[ele]==true){
                ans=false;//fals means there is cycle
                return;
            }
           if(!vis[ele]) dfs(ele,adj,vis,path);
        }
        path[i]=false;
    }
}