class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int s2= t.length();
        if(s1!=s2) return false;
        char[] arr1 = new char[s1];
        char[] arr2 = new char[s1];
        for(int i=0;i<s1;i++){
            arr1[i]=s.charAt(i);
        }
         for(int i=0;i<s1;i++){
            arr2[i]=t.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s1;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}