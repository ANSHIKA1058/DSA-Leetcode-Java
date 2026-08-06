class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        int dig1=temp%10;
        int ans =0;
        temp/=10;
        if(temp!=0){
            int dig2=temp%10;
            int pro=dig1*dig2;
            if(pro%t!=0){
            ans = smallestNumber(n+1,t);
           }else{
            ans = n;
           }
        }
        else{
            if(dig1%t==0){
                ans=dig1;
            }else{
                ans=smallestNumber(n+1,t);
            }
        }
        
   
        
        return ans;
    }
  }
