class Solution {
    public int maxSubArray(int[] nums) {
        //kdanes algoo
       int currSum =nums[0];
       int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxsum = Math.max(maxsum,currSum);
        }
        return maxsum;

    }
}