class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();
        for(int num1:nums1){
            st1.add(num1);
        }
        for(int num2:nums2){
            st2.add(num2);
        }
        List<Integer> list = new ArrayList<>();
        int len=0;
        for(int num1:st1){
            for(int num2:st2){
                if(num1==num2){
                    len++;
                    list.add(num2);
                }
            }
        }
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}