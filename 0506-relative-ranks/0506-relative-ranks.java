class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }
        int rank=1;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int idx= curr[1];
            if(rank==1){
                ans[idx]="Gold Medal";
            }else if(rank==2){
                ans[idx]="Silver Medal";
            }else if (rank==3){
                ans[idx]="Bronze Medal";
            }else{
                ans[idx]=String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}