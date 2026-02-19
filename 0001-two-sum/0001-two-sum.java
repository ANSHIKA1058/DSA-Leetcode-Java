class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans ={-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int partner = target-nums[i];
            if(mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
        
                mp.put(nums[i],i);
            
        }
        return ans;
    }
}