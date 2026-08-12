class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0]=true;
        dfs(0,rooms,vis);
        for(boolean ele: vis){
            if(!ele){
                return false;
            }
        }
        return true;
    }
    public void dfs(int i,List<List<Integer>> rooms,boolean[] vis){

        vis[i]=true;
        for(int ele:rooms.get(i)){
            if(!vis[ele]) dfs(ele,rooms,vis);
        }
    }
}