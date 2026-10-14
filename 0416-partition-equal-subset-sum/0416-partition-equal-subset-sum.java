class Solution {
    public boolean canPartition(int[] nums) {
        int n =nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        int[][] dp = new int[n][target+1];
        for(int i=0;i<n;i++){
            for(int j =0;j<=target;j++){
                dp[i][j]=-1;
            }
        }

        return subset(0,target,nums,dp);
    }
    public boolean subset(int i, int target,int[] nums,int[][] dp){
        if(target==0) return true;
        if(i==nums.length) return false;
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean skip = subset(i+1,target,nums,dp);
        boolean pick =false;
        if(target>=nums[i]){
            pick=subset(i+1,target-nums[i],nums,dp);
        }
        boolean ans = pick|| skip;
        dp[i][target]= ans?1:0;
        return ans;
    }
}