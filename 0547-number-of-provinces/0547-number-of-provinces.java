class Solution {
    public void bfs(int[][] isConnected,boolean[] isVis,int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        isVis[i]=true;
        while(!q.isEmpty()){
            int p =q.poll();
        for(int j=0;j<isConnected.length;j++){
            
            if(isConnected[p][j]==1 && !isVis[j]){
                q.add(j);
                isVis[j]=true;
            }
        }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] isVis= new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!isVis[i]){
                count++;
                bfs(isConnected,isVis,i);
            }
        }
        return count;
    }
}