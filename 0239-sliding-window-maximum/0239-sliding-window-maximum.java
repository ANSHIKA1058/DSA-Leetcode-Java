class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int j=0;
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<n;i++){
            maxheap.offer(new int[]{nums[i],i});
            while(maxheap.peek()[1]<=i-k){
                maxheap.poll();
            }
            if(i>=k-1){
                ans[j++]=maxheap.peek()[0];
            }
        }
        return ans;
    }
}