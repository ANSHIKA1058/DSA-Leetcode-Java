class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();
        for(int num: nums1){
            st1.add(num);
        }
        for(int num2:nums2){
            st2.add(num2);
        }
        int len=0;
        List<Integer> list = new ArrayList<>();
        for(int num:st1){
            for(int num2:st2){
                if(num==num2){
                    len++;
                    list.add(num2);
                }
            }
        }
        int[] ans =new int[len];
        for(int i=0;i<len;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}