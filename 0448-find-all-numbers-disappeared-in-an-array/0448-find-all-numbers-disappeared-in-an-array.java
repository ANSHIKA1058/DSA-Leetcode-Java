class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int n =nums.length;
        for(int i:nums){
            st.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!st.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}