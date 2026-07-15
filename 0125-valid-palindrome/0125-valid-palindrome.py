class Solution:
    def isAlphnum(self, s: str) -> bool:
        x = ord(s)
        if 97<=x<=122 or 48<=x<=57:
            return True
        else:
            return False
    def isPalindrome(self, s: str) -> bool:
        stt = s.lower()
        i = 0
        j = len(stt)-1
        while i<=j:
            if not self.isAlphnum(stt[i]):
                i+=1
            elif not self.isAlphnum(stt[j]):
                j-=1
            
            elif stt[i]==stt[j]:
                i+=1
                j-=1
            else:
                return False
        return True