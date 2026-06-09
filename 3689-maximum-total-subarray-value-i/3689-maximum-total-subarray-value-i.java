class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        return k*(max-min);
    }
}