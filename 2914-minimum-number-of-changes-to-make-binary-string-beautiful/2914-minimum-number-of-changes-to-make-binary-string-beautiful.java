class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int flip=0;
        for(int i=0;i<n;i+=2){
            char f = s.charAt(i);
            char t = s.charAt(i+1);
            if(f!=t){
                flip++;
            }
        }
        return flip;
    }
}