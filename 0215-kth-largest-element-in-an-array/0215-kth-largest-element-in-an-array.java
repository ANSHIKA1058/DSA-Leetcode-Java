class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minheap = new PriorityQueue<>();
         for(int e:nums){
            minheap.offer(e);
            if(minheap.size()>k){
                minheap.poll();
            }
         }
         return minheap.peek();
    }
}