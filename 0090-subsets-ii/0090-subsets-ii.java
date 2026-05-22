class Solution {
    public  List<List<Integer>>  subsetsWithDup(int[] nums) {
         List<List<Integer>> ans= new ArrayList<>();
         Arrays.sort(nums);
         List<Integer> list = new ArrayList<>();
         helper(nums,ans,list,0);
         return ans;
    }
    public void helper(int[] nums, List<List<Integer>> ans,List<Integer> list,int idx){
        ans.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            helper(nums,ans,list,i+1);
            list.remove(list.size()-1);
        }
    }
}