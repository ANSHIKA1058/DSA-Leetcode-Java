class Solution {
     public boolean isNumber(String s ){
        if(s.equals("+") || s.equals("-") ||s.equals("*") || s.equals("/")){
            return false;
        }
        return true;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s: tokens){
            if(isNumber(s)){
                st.push(Integer.parseInt(s));
            }else{
                int a = st.pop();
                int b = st.pop();
                if(s.equals("+")){
                    st.push(a+b);
                }else if(s.equals("-")){
                    st.push(b-a);
                }else if(s.equals("*")){
                    st.push(a*b);
                }else{
                    st.push(b/a);
                }
            }
           
        }
         return st.pop();
    }
   
}