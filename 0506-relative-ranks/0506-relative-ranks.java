class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<n;i++){
            maxheap.offer(new int[]{score[i],i});
        }
        String[] ans = new String[n];
        int rank=1;
        while(!maxheap.isEmpty()){
            int[] curr= maxheap.poll();
            int idx =curr[1];
            if(rank==1){
                ans[idx]="Gold Medal";
            }else if(rank==2){
                ans[idx]="Silver Medal";
            }else if(rank==3){
                ans[idx]="Bronze Medal";
            }else{
                ans[idx]=String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}