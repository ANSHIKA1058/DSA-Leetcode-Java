class Solution {
    public int trap(int[] height) {
        //using stack t=n s = n
        int n = height.length;
        int water=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int top=st.pop();
                if(st.isEmpty()) break;
                int dis= i-st.peek()-1;
                int trapHeight= Math.min(height[i],height[st.peek()])-height[top];
                water+=dis*trapHeight; 
            }
            st.push(i);
        }
        return water;
    }
}