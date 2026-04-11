class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n =ast.length;
        Stack<Integer> st = new Stack<>();
        for(int a:ast){
            boolean destroy = false;
            while(!st.isEmpty() && st.peek()>0 && a<0){
                if(Math.abs(a)>st.peek()){
                    st.pop();
                }else if(Math.abs(a)==st.peek()){
                    st.pop();
                    destroy = true;
                    break;
                }else{
                    destroy=true;
                    break;
                }
            }
            if(!destroy){
                st.push(a);
            }
        }
        int[] res= new int[st.size()];
        for(int i =st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}