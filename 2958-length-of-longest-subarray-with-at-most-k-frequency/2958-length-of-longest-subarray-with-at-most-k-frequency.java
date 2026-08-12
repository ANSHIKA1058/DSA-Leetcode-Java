class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n =nums.length;
       HashMap<Integer,Integer> mp = new HashMap<>();
       int ans=0;
       int l =0;
       for(int r=0;r<n;r++){
        mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);

        while(mp.get(nums[r])>k){
            mp.put(nums[l],mp.get(nums[l])-1);
            l++;
        }
        ans = Math.max(ans,r-l+1);
       }
       return ans;
    }
}