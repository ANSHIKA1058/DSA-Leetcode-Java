class Solution {
    public int maximumWealth(int[][] acc) {
        int r = acc.length;
        int c = acc[0].length;
        int max=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=acc[i][j];
            }
            max =Math.max(max,sum);
        }
        return max;
    }
}