class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(cand,ans,list,0,target);
        return ans;
    }
    public void helper(int[] cand, List<List<Integer>> ans , List<Integer> list, int idx , int target){
        if(idx==cand.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            
            }
            return;
        }
        if(cand[idx]<=target){
        list.add(cand[idx]);
        helper(cand,ans,list,idx,target-cand[idx]);
        list.remove(list.size()-1);
        }
        helper(cand,ans,list,idx+1,target);
    }
}