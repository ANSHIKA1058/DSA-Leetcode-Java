class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum=0;
      int l=0;
      int minlen=Integer.MAX_VALUE;
      for(int r=0;r<n;r++){
        sum+=nums[r];
        while(sum>=target){
            int len = r-l+1;
            minlen=Math.min(minlen,len);
            sum=sum-nums[l];
            l++;
        }
      }
      if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}