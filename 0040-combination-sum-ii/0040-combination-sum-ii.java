class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(cand);
        helper(cand,t,list,ans,0);
        return ans;
    }
    public void helper(int[] cand,int t, List<Integer> list, List<List<Integer>> ans,int idx){
        if(t==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<cand.length;i++){
            if(i>idx && cand[i]==cand[i-1]) continue;
            if(cand[i]>t) break;
            list.add(cand[i]);
            helper(cand,t-cand[i],list,ans,i+1);
            list.remove(list.size()-1);
        }
    }
}