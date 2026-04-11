class Solution {
    public int maximalRectangle(char[][] mat) {
       
        int n = mat.length;
        int m = mat[0].length;
        int maxArea = 0;
        int[] height = new int[m];
        
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == '1') {
                    height[j] += 1;
                } else {
                    height[j] = 0;
                }
            }
            
          
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        
        return maxArea;
    }
    
   
    private int largestRectangleArea(int[] height) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = height.length;
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                int ele = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                max = Math.max(max, (nse - pse - 1) * height[ele]);
            }
            st.push(i);
        }
        
        while (!st.isEmpty()) {
            int ele = st.pop();
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            max = Math.max(max, (nse - pse - 1) * height[ele]);
        }
        
        return max;
    }
}