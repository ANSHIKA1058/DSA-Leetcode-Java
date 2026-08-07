class MedianFinder {
    PriorityQueue<Integer> minh = new PriorityQueue<>();
     PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());

    public void addNum(int num) {
        if(maxh.size()==0){
            maxh.offer(num);
        }else{
            if(maxh.peek()>=num){
                maxh.offer(num);
            }else{
                minh.offer(num);
            }
        }

        //balancing
        if(maxh.size()==minh.size()+2){
            minh.offer(maxh.remove());
        }else if(minh.size()==maxh.size()+2){
            maxh.offer(minh.remove());
        }
    }
    
    public double findMedian() {
        if(maxh.size()==minh.size()+1){
            return maxh.peek();
        }else if(minh.size()==maxh.size()+1){
            return minh.peek();
        }else{
            return (minh.peek()+maxh.peek())/2.0;
        }
    }
}

