class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0]=true;
        bfs(0,rooms,vis);
        for(boolean ele: vis){
            if(!ele){
                return false;
            }
        }
        return true;
    }
    public void bfs(int i,List<List<Integer>> rooms,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int p =q.poll();
            for(int ele:rooms.get(p)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele]=true;
                }
            }
        }
    }
}