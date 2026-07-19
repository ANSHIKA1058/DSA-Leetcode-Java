class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        int ans =-1;
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(list.contains(-i)){
                ans = Math.max(ans,Math.abs(i));
            }
            list.add(i);
        }
        return ans;
    }
}