class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> ans = new ArrayList<>();
       helper(nums,list,0);
       return list; 
    }
    public void helper(int[] nums,List<List<Integer>> list, int idx){
        if(idx==nums.length){
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ans.add(nums[i]);
            }
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            helper(nums,list,idx+1);
            swap(i,idx,nums);
        }

    }
    private void swap(int i,int j , int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}