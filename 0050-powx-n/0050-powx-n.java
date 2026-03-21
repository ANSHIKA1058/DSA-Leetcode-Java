class Solution {
    public double myPow(double x, int n) {
        int N=n;
        if(N<0){
            N=-N;
            x=1/x;
        }
        return pow(x,N);
    }
    public double pow(double x,int n){
        if(n==0) return 1;
        double half= pow(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
}