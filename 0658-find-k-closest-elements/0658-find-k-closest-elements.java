class Solution {
    class Pair{
        int dist;
        int val;
        Pair(int dist,int val){
            this.dist=dist;
            this.val=val;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.dist==b.dist)
                return b.val-a.val;
            return b.dist-a.dist;
        });

        for(int n :arr){
            pq.offer(new Pair(Math.abs(n-x),n));
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().val);
        }
        Collections.sort(list);
        return list;
    }
}