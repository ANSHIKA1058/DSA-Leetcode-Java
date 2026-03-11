class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
       int allone=0;
       int temp = n;
       while(temp>0){
        allone= (allone<<1)|1;
        temp=temp>>1;
       }
       return n^allone;
    }
}