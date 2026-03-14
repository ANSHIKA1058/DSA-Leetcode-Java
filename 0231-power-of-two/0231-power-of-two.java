class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int bit= Integer.bitCount(n);
        return bit==1;

    }
}