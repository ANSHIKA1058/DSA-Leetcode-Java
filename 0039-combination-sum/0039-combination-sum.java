class Solution {
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans,list,can,t,0);
        return ans;
    }
    public void helper(List<List<Integer>> ans, List<Integer> list , int[] can, int t , int idx){
        if(idx==can.length){
            if(t==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(can[idx]<=t){
            list.add(can[idx]);
            helper(ans,list,can,t-can[idx],idx);
            list.remove(list.size()-1);
        }
        helper(ans,list,can,t,idx+1);
    }
}