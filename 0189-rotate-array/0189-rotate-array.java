class Solution {
    public void rotate(int[] nums, int k) {
        // 1. pura  reverse 2. 1st k rev 3. left rev
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    // n tc 1 sc
    public void reverse(int[] arr , int i, int l){
        while(i<l){
            int temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;
            l--;
            i++;
        }
        
    }
}