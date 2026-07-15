class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ans = 0
        for acc in accounts:
            ans = max(ans,sum(acc))
        return ans