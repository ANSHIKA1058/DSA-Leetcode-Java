class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n =nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] isvis = new boolean[n];
        helper(ans,list,nums,isvis);
        return ans;
    }
    public void helper(List<List<Integer>> ans, List<Integer> list ,
    int[] nums,
    boolean[] isvis){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!isvis[i]){
                list.add(nums[i]);
                isvis[i]=true;
                helper(ans,list,nums,isvis);
                isvis[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}