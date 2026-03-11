class Solution {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length-1;
        int max=0;
        while(l<=height.length && r>=0){
            int h=Math.min(height[l],height[r]);
            int width = r-l;
            int area = width*h;
            max = Math.max(max,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        }
        return max;
    }
}