class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int j=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{nums[i],i});

            //remove element outside the frame
            while(pq.peek()[1]<=i-k){
                pq.poll();
            }
            //frame size

            if(i>=k-1){
                ans[j++]=pq.peek()[0];
            }
           
        }
         return ans;
    }
}