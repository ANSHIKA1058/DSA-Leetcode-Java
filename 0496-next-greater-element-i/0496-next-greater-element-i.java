class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nextGE= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()) nextGE[i]=-1;
            else nextGE[i]=st.peek();

            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int idx=0;
            while(nums1[i]!=nums2[idx]){
                idx++;
            }
            ans[i]=nextGE[idx];
        }
        return ans;
    }
}