class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        pro = 1
        sum = 0
        temp = n
        while temp>0:
            dig=temp%10
            sum+=dig
            pro*=dig
            temp//=10
        
        return pro-sum
        