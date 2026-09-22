class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        helper(ans,digits,mp,"",0);
        return ans;

    }
    public void helper(List<String> ans, String digits,HashMap<Character,String> mp,String curr,int idx){
        if(idx==digits.length()){
            ans.add(curr);
            return;
        }

        String s = mp.get(digits.charAt(idx));
        for(char ch:s.toCharArray()){
            helper(ans,digits,mp,curr+ch,idx+1);
        }
    }
}