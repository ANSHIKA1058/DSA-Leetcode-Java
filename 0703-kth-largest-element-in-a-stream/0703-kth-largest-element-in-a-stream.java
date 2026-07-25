import java.util.*;
class KthLargest {
    PriorityQueue<Integer> minheap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k =k;
        minheap=new PriorityQueue<>();
        for(int n:nums){
            minheap.offer(n);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        
        
    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size()>k){
            minheap.poll();
        }
        return minheap.peek();
        
    }
}

