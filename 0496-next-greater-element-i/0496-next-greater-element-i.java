class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    break;
                }
            }

                int next=-1;
                for(int k=j+1;k<nums2.length;k++){
                    if(nums2[k]>nums1[i]){
                        next=nums2[k];
                        break;
                    }
                }
            arr[i]=next;
            
            
        }
        return arr;
    }
}