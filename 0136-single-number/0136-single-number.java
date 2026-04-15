class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }else{
                st.remove(nums[i]);
            }
        }
        return st.iterator().next();
    }
}