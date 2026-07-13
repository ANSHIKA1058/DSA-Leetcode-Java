class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int osum=0;
        int esum=0;
        int i=1;
        while(i<=2*n){
            if(i%2==0){
                esum+=i;
            }else{
                osum+=i;
            }
            i++;
        }
      
        return gcd(esum,osum);
    }
}