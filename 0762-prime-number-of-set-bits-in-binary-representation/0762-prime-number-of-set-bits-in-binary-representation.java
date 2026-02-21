class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int bits =Integer.bitCount(i);
            if(isprime(bits)){
                count++;
            }
        }
        return count;
    }
    private boolean isprime(int bits){
        if(bits<2) return false;
        for(int i=2;i*i<=bits;i++){
            if(bits%i==0) return false;
        }
        return true;
    }
}