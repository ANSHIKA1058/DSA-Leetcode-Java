class Solution {
    public String stringHash(String s, int k) {
        int n =s.length();
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=(s.charAt(j)-'a');
            }
            char ch = (char)('a'+(sum%26));
            sb.append(ch);
            i+=k;
        } 
        return sb.toString();    
    }
}