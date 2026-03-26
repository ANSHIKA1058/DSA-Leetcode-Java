class Solution {
    public int maxProfit(int[] prices) {
        //using dp
        int n = prices.length;
        if(n==0) return 0;
        int[] dp = new int[n];
        dp[0]=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            min = Math.min(prices[i],min);
            dp[i]=Math.max(dp[i-1],prices[i]-min);
        }
        return dp[n-1];
        
    }
}