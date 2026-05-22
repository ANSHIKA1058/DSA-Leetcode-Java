class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(cand,ans,list,t,0);
        return ans;
    }
    public void helper(int[] cand,List<List<Integer>> ans,List<Integer> list,int t,int idx){
        if(idx==cand.length){
            if(t==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(cand[idx]<=t){
            list.add(cand[idx]);
            helper(cand,ans,list,t-cand[idx],idx);
            list.remove(list.size()-1);

        }
        helper(cand,ans,list,t,idx+1);
    }
}