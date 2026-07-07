class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev = 0
        temp = x
        while temp>0:
            dig = temp%10
            rev = rev*10+dig
            temp//=10
        
        if rev==x:
            return True
        else:
            return False
        