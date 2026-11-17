import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
    int n1 = s.length();
    int n2 = t.length();
    if(n1!=n2){
        return false;
    }
    char[] arr1=s.toLowerCase().toCharArray();
    char[] arr2=t.toLowerCase().toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
    }
    }