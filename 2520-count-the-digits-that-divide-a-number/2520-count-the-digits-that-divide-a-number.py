class Solution:
    def countDigits(self, num: int) -> int:
        
        count = 0
        n = num
        while n>0:
            dig = n%10
            if num%dig==0:
                count+=1
            n//=10
        return count