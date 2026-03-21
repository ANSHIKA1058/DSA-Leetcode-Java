class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int f0 = 1;
        int f1 =2;
        int curr=0;
        //fibo
        for(int i=3;i<=n;i++){
            curr=f0+f1;
            f0=f1;
            f1=curr;
        }
        return f1;
    }
}