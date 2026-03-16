class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int curr=0;
    
        for(int i=0;i<k;i++){
            curr+=nums[i];
        }
        double max = (double)curr/k;
        double avg=0;
        for(int i=1;i<=nums.length-k;i++){
            curr= curr-nums[i-1]+nums[i+k-1];
            avg=(double)curr/k;
            if(avg>max){
                max=avg;
            }
        }
        return max;
        
    }
}