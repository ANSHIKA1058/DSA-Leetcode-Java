class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n+1];
    Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        for(int x=1;x<=n-1;x++){
            for(int i=0;i<times.length;i++){
                int u=times[i][0];
                int v = times[i][1];
                int d = times[i][2];
                if(dist[u]!=Integer.MAX_VALUE && (dist[u]+d)<dist[v]){
                    dist[v]=dist[u]+d;
                }
            }
        }
        int max =0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(dist[i],max);
        }
        
        return max;
    }
}