class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int n:mp.keySet()){
            maxheap.offer(new int[]{n,mp.get(n)});
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=maxheap.poll()[0];
        }
        return ans;
    }
}