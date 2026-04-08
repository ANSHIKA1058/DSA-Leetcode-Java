class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,list,nums,0);
        return ans;

    }
    public void helper(List<List<Integer>> ans, List<Integer> list,int[] nums, int idx){
        ans.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            helper(ans,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}