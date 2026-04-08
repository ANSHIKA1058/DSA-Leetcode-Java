class Solution {
    public int numWaterBottles(int n, int e) {
        int totaldrunk = n;
        while(n>=e){
            n-=(e-1);
            totaldrunk++;
        }
        return totaldrunk;
    }
}