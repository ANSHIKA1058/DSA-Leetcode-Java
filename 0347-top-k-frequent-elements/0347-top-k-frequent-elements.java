class Solution {
    class Pair{
        int num;
        int freq;
        Pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.freq - b.freq
        );
        for(int ke :mp.keySet()){
            pq.offer(new Pair(ke,mp.get(ke)));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll().num;
        }
        return ans;
    }
}