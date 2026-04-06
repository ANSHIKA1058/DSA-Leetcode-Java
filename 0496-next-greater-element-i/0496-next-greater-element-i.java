class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                mp.put(nums2[i],-1);
            }else{
                mp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int j=0;j<nums1.length;j++){
             ans[j]=mp.get(nums1[j]);
        }
    return ans;
    }
}