class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        
        helper(ans, n , k , new ArrayList<>(),1);
        return ans;
    }
    public void helper(List<List<Integer>> ans,int n, int k,
    List<Integer> list , int idx){

        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<=n;i++){
            list.add(i);
            helper(ans,n,k,list,i+1);
            list.remove(list.size()-1);
        }
    }
}