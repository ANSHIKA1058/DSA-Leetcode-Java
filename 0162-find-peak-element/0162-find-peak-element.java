class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int high= nums.length-1;
        while(l<high){
            int mid = l+(high-l)/2;
            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }else{
                high=mid;
            }
        }
return l;
    }
}