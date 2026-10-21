class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans,list,0,nums);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> list,int idx, int[] nums){
        if(idx==nums.length){
            if(ans.contains(list)) return;
            ans.add(new ArrayList<>(list));
            return;
        }
         //include
        list.add(nums[idx]);
        helper(ans,list,idx+1,nums);
        //exclude
        list.remove(list.size()-1);
        helper(ans,list,idx+1,nums);
    }
}