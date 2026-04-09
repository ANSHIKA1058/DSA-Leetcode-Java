class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int n: nums2){
        while(!st.isEmpty() && st.peek()<n){
                mp.put(st.pop(),n);
            }
            st.push(n);
        }
        while(!st.isEmpty()){
            mp.put(st.pop(),-1);
        }
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=mp.get(nums1[i]);
        }
        return arr;
    }
}