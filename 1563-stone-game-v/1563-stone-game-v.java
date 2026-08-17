class Solution {
    int[] prefix;
    int[][] dp;
    public int stoneGameV(int[] stone) {
        int n =stone.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+stone[i];
        }
        return solve(0,n-1);
    }
    public int solve(int i, int j){
        int ans =0;
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        for(int k=i;k<j;k++){
            int left = prefix[k+1]-prefix[i];
            int right = prefix[j+1]-prefix[k+1];

            if(left<right){
                ans =Math.max(ans,left+solve(i,k));
            }else if(right<left){
                ans =Math.max(ans,right+solve(k+1,j));
            }else{
                ans =Math.max(ans,left+Math.max(solve(i,k),solve(k+1,j)));
            }
        }
        dp[i][j]=ans;
        return ans;
    }
}