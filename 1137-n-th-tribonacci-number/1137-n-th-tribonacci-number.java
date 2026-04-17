class Solution {

    private int[] memo;
    
    public int tribonacci(int n){
        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        // Set base cases
        if (n >= 0) memo[0] = 0;
        if (n >= 1) memo[1] = 1;
        if (n >= 2) memo[2] = 1;
        
        return helper(n);
    }
    
    private int helper(int n) {
        // Return if already computed
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = helper(n - 1) + helper(n - 2) + helper(n - 3);
        return memo[n];
    }
}