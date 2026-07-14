class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
       sum = nums[0]
       n = len(nums)
       ans = []
       ans.append(nums[0])
       for i in range(1,n):
        sum+=nums[i]
        ans.append(sum)
       return ans