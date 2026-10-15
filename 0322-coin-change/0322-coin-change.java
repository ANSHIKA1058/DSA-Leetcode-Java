class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        long ans = coinCount(0, coins, amount, dp);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return (int) ans;
    }
    public long coinCount(int i, int[] coins, int amt, long[][] dp) {
        if (amt == 0) {
            return 0;
        }
        if (i == coins.length) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][amt] != -1) {
            return dp[i][amt];
        }
        long skip = coinCount(i + 1, coins, amt, dp);
        if(amt-coins[i]<0) return dp[i][amt]=skip;
        long pick = 1+coinCount(i,coins,amt-coins[i],dp);
        
        return dp[i][amt] = Math.min(skip, pick);
    }
}
