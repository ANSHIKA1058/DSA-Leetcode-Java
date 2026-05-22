class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        helper(ans,list,s,0);
        return ans;
    }
    private void helper(List<List<String>> ans , List<String> list, String s,int idx){
        if(idx==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                list.add(s.substring(idx,i+1));
                helper(ans,list,s,i+1);
                list.remove(list.size()-1);
            }
        }

    }
    private boolean isPalindrome(String s, int left , int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}