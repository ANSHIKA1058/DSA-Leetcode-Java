class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int[] n:points){
            int x = n[0];
            int y = n[1];
            int dis = x*x+y*y;
            maxheap.offer(new int[]{dis,x,y});
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(!maxheap.isEmpty()){
            int[] curr = maxheap.poll();
            ans[i][0]=curr[1];
            ans[i][1]=curr[2];
            i++;
        }
        return ans;
    }

}