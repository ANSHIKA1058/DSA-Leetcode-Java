class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            int max =0;
            for(int ele:nums){
                max=Math.max(max,ele);
            }
            return max;
        }


        int[] freq = new int[51];
        for(int ele:nums){
            freq[ele]++;
        }
        int ans=-1;
        if(k==1){
            for(int ele:nums){
                if(freq[ele]==1){
                    ans=Math.max(ans,ele);
                }
            }
        }

        if(freq[nums[0]]==1){
            ans=Math.max(ans,nums[0]);
        }
        if(freq[nums[n-1]]==1){
            ans=Math.max(ans,nums[n-1]);
        }
return ans;


    }
}