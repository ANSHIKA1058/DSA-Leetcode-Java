class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n =nums.length;
        HashSet<Integer> st = new HashSet<>();
        for(int num:nums){
            st.add(num);
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