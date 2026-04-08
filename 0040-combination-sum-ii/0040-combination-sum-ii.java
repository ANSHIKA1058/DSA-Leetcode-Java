class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        helper(arr,target,0,ans,list);
        return ans;
    }
    public void helper(int[] arr, int target, int idx,  List<List<Integer>> ans, List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            list.add(arr[i]);
            helper(arr, target-arr[i],i+1,ans, list);
            list.remove(list.size()-1);
        }
    }
}