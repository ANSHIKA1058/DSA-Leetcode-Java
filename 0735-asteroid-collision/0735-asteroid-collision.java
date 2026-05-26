class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();

        for(int a:ast){
            boolean exp=false;
            while(!st.isEmpty() && st.peek()>0 && a<0){
                if(Math.abs(st.peek())<Math.abs(a)){
                    st.pop();
                    continue;
                }else if(Math.abs(st.peek())==Math.abs(a)){
                    st.pop();
                    exp=true;
                    break;
                }else{
                    exp=true;
                    break;
                }
            }
            if(!exp){
                st.push(a);
            }
        }
        int[] res = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}