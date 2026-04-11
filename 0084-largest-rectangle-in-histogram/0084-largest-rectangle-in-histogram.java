class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse = findPSE(heights);
        int[] nse = findNSE(heights);
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            maxArea=Math.max(maxArea,((nse[i]-pse[i]-1)*heights[i]));
        }
        return maxArea;

    }
    public int[] findPSE(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek();
            }else{
                ans[i]=-1;
            }
            st.push(i);
        }
        return ans;

    }
    public int[] findNSE(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];

        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=heights.length;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
        

    }
}
