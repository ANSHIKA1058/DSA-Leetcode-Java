class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i=0;
        int j = n-1;
        int lmax=0;
        int rmax=0;
        int trap=0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>=lmax){
                    lmax=height[i];
                }else{
                    trap+=lmax-height[i];
                }
                i++;
            }
            else{
                if(height[j]>=rmax){
                    rmax=height[j];
                }else{
                    trap+=rmax-height[j];
                }
                j--;
            }
        }
        return trap;
        
    }
}