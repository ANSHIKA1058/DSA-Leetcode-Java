class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int[] ans = new int[set.size()];
        int pos=0;
        for(int a:set){
            ans[pos]=a;
            pos++;
        }
        return ans;
    }
}