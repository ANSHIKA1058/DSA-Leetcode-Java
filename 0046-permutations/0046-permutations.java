class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         helper(ans,nums,0);
         return ans;
    }
    public void helper( List<List<Integer>> ans,int[] nums, int idx){
        if(idx==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<nums.length;i++){
             swap(i,idx,nums);
             helper(ans,nums,idx+1);
             swap(i,idx,nums);
        }
    }
    public void swap(int l,int r,int[] nums){
        int temp= nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}