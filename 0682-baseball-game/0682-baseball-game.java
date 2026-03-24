class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<ops.length;i++){
            String s= ops[i];
            if(s.equals("+")){
                int a= st.pop();
                int b = st.peek();
                int sum= a+b;
                st.push(a);
                st.push(sum);
            }else if(s.equals("D")){
                st.push(2*st.peek());
            }else if(s.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}