class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left =0;
        long right=Long.MAX_VALUE;
        while(left<right){
            long mid = left+(right-left)/2;
            if(canfinish(mid,mountainHeight,workerTimes)){
                right =mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    boolean canfinish(long time,int h,int[] workerTimes){
        long total=0;
        for(int w:workerTimes){
            long x =(long)((Math.sqrt(1+(8.0*time)/w)-1)/2);
            total+=x;
            if(total>=h)return true;
           
        }
         return total>=h;}
    
}