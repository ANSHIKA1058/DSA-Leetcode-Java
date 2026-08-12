class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left=0;
        int ans =0;
        for(int right=0;right<n;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.get(nums[right])>k){
                mp.put(nums[left],mp.get(nums[left])-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}