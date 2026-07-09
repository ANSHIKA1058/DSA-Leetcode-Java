class Solution:
    def findGCD(self, nums: List[int]) -> int:
        chota = min(nums)
        bda = max(nums)
        ans = gcd(bda,chota)
        return ans
    def gcd(self, bda: int, chota: int) -> int:
        if chota==0:
            return bda
        return self.gcd(chota,bda//chota) 