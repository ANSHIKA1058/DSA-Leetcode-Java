class Solution {
    public int largestRectangleArea(int[] height) {
        //optimise solution in tc = n+n ans sc = n
        Stack<Integer> st = new Stack<>();
        int max=0;
        int pse=0;
        int nse=0;
        int ele=0;
        int n = height.length;
        for(int i=0;i<=n-1;i++){
            while(!st.isEmpty() && height[st.peek()]>=height[i]){
                ele = st.pop();
                nse =i;
                pse = (st.isEmpty())?-1:st.peek();
                max=Math.max(max,(nse-pse-1)*height[ele]); 
            }
            st.push(i);
        }

        //yha st m bs vo bache jinka nse =n h mtln hai hi nhi 
        while(!st.isEmpty()){
            ele =st.pop();
            nse=n;
            pse = st.isEmpty()?-1:st.peek();
             max=Math.max(max,(nse-pse-1)*height[ele]); 
        }
        return max;
    }
}