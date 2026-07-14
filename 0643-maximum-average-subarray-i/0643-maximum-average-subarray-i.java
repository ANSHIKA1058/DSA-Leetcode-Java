class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max = (double)sum/k;
        double avg=0;
        for(int i=1;i<=n-k;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            avg=(double)sum/k;
            if(avg>max){
                max=avg;
            }
        }
        return max;
    }
}