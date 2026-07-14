class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum =0
        maxsum= nums[0]
        for i in range(len(nums)):
            curr_sum+=nums[i]
            if curr_sum>maxsum:
                maxsum=curr_sum
            if curr_sum<0:
                curr_sum = 0
        return maxsum