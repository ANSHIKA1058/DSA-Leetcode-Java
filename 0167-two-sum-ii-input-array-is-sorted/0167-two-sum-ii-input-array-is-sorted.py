class Solution:
    def twoSum(self, num: List[int], target: int) -> List[int]:
        l = 0
        r = len(num)-1
        while l<r:
            sum = num[l]+num[r]
            if sum==target:
                return [l+1,r+1]
            elif sum<target:
                l+=1
            else:
                r-=1
            
        