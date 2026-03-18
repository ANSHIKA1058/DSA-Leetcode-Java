class Solution {
    public boolean backspaceCompare(String s, String t) {
        return builds(s).equals(builds(t));
    }
    public String builds(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty()){
                st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        return String.valueOf(st);
     }
}