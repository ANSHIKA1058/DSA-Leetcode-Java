class Solution {
    public String stringHash(String s, int k) {
        int i=0;
        int n =s.length();
        StringBuilder sb = new StringBuilder();
        while(i<n){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=(s.charAt(j)-'a');

            }
            char c = (char)('a'+(sum%26));
            sb.append(c);
            i+=k;
        }
        return sb.toString();
    }
}