class Solution {
    public int numWaterBottles(int n, int e) {
        int totaldrunk = n;
        //tc =n linear sc=1 constant
        while(n>=e){
            n-=(e-1);
            totaldrunk++;
        }
        return totaldrunk;
    }
}