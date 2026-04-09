class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        //tc= n^2 sc 1
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j =1;j<n;j++){
                int idx = (i+j)%n;
                if(nums[idx]>nums[i]){
                    res[i]=nums[idx];
                    break;
                }
            }
        }
        return res;
    }
}