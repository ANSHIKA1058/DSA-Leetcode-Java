class Solution {
    public int mincost(int[] cost, int[] dp, int i){
        if(i==0 || i==1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i]=cost[i]+Math.min(mincost(cost,dp,i-1),mincost(cost,dp,i-2));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,dp,n-1),mincost(cost,dp,n-2));
    }
}