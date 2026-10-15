class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        long ans = coinCount(0,coins,dp,amount);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return (int) ans;
    }
    public long coinCount(int i,int[] coins,long[][] dp, int amt){
        if(amt==0) return 0;
        if(i==coins.length) return Integer.MAX_VALUE;
        if(dp[i][amt]!=-1){
            return dp[i][amt];
        }
        long skip=coinCount(i+1,coins,dp,amt);
        if(amt-coins[i]<0) return dp[i][amt]=skip;
        long pick =1+ coinCount(i,coins,dp,amt-coins[i]);

        return dp[i][amt]=Math.min(pick,skip);
    }
}