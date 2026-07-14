class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        maxprofit = 0
        min = prices[0]
        for i in range(0,n):
            if prices[i]<min:
                min = prices[i]
            else:
                profit = prices[i]-min
                maxprofit=max(maxprofit,profit)
        return maxprofit