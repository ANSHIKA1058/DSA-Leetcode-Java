class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans,new ArrayList<>(),1,n ,k);
        return ans;
    }
    public void helper(List<List<Integer>> ans, List<Integer> list , int idx, int n, int k){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=n;i++){
            list.add(i);
            helper(ans,list,i+1,n,k);
            list.remove(list.size()-1);
        }
    }
}