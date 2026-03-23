class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int count=0;
        for(int i:nums){
            if(i!=0){
                pro*=i;
            }else{
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count>1){
                nums[i]=0;
            }else if(count==1){
                if(nums[i]==0){
                    nums[i]=pro;
                }else{
                    nums[i]=0;
                }
            }else{
                nums[i]=pro/nums[i];
            }
        }
        return nums;
    }
}