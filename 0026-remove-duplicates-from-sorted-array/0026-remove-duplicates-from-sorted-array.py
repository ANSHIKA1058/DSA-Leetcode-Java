class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        start = 0
        n = len(nums)
        for i in range(1,n):
            if nums[start]!=nums[i]:
                start+=1
                nums[start]=nums[i]
        return start+1        