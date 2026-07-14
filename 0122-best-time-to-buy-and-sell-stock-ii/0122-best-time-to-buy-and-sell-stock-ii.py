class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)

        ans = []
        sum=0
        for i in range(1,n):
            if(prices[i-1]<prices[i]):
                ans.append(prices[i]-prices[i-1])
        for j in ans:
            sum+=j
        return sum
