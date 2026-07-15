class Solution:
    def spiralOrder(self, mat: List[List[int]]) -> List[int]:
        n = len(mat)
        m = len(mat[0])
        total = n*m
        ans = []
        c = 0
        colstart=0
        rowstart=0
        colend=m-1
        rowend=n-1
        while c<total:
            for i in range(colstart,colend+1):
                ans.append(mat[rowstart][i])
                c+=1
            rowstart+=1
            if c==total:
                break
            for j in range(rowstart,rowend+1):
                ans.append(mat[j][colend])
                c+=1
            colend-=1
            if c==total:
                break
            
            for k in range(colend,colstart-1,-1):
                ans.append(mat[rowend][k])
                c+=1
            rowend-=1
            if c==total:
                break

            for l in range(rowend,rowstart-1,-1):
                ans.append(mat[l][colstart])
                c+=1
            colstart+=1
            if c==total:
                break
        return ans

