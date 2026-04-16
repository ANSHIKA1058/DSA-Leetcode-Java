class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointer + sortinh + 2d array
        int n = nums.length;
        int[][] mp = new int[n][2];
        for(int i=0;i<n;i++){
            mp[i][0]=nums[i];
            mp[i][1]=i;
        }
        Arrays.sort(mp,(a,b)->a[0]-b[0]);
        int l=0;
        int r=n-1;
        while(l<r){
            int sum= mp[l][0]+mp[r][0];
            if(sum==target){
                return new int[]{mp[l][1],mp[r][1]};
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}