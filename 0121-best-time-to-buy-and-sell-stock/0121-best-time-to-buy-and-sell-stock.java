class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min= prices[i];
            }else{
                int profit=prices[i]-min;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}