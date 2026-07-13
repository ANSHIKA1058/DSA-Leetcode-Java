class Solution:
    def gcd(self, o: int,e: int) -> int:
        if e==0:
            return o
        return self.gcd(e, o%e)
    def gcdOfOddEvenSums(self, n: int) -> int:
        oddsum = 0
        evensum = 0
        i = 1
        while (i<=2*n):
            if i%2==0:
             evensum+=i
            else:
             oddsum+=i
            i+=1
        ans = gcd(oddsum,evensum)
        return ans

        