class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k==n){
            int max=0;
            for(int e:nums){
                max=Math.max(max,e);
            }
            return max;
        }

        int[] freq = new int[51];
        for(int e:nums){
            freq[e]++;
        }
        int ans=-1;
        if(k==1){
            for(int e:nums){
                if(freq[e]==1){
                    ans=Math.max(ans,e);
                }
            }
            return ans;

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