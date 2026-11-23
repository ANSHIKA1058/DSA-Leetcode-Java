class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));


        int start = 0;

        int end=Integer.MAX_VALUE;

        int max =Integer.MIN_VALUE;

        for(int i=0;i<nums.size();i++){
            minheap.add(new int[]{nums.get(i).get(0),i,0});
            max=Math.max(max,nums.get(i).get(0));
        }

        while(minheap.size()==nums.size()){
            int[] curr = minheap.poll();
            int min = curr[0];
            int r=curr[1];
            int c = curr[2];

            if(max-min<end-start){
                start=min;
                end=max;
            }

            if(c+1==nums.get(r).size()){
                break;
            }

            int next = nums.get(r).get(c+1);
            minheap.add(new int[]{next,r,c+1});
            max=Math.max(max,next);

        }
        return new int[]{start,end};
    }
}