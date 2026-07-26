import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
       
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            maxheap.offer(n);
        }
        while(maxheap.size()>1){
            int f=maxheap.poll();
            int s= maxheap.poll();
            if(f!=s){
                maxheap.offer(Math.abs(f-s));
            }
        }
        return maxheap.isEmpty()?0:maxheap.peek();
    }
}