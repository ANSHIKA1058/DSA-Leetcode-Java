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
         mp.put('9',"wxyz");

         helper(ans,mp,digits,0,"");
         return ans;
    }
    public void helper(List<String> ans,HashMap<Character,String> mp,
    String digits,int idx,String str){
        if(idx==digits.length()){
            ans.add(str);
            return;
        }

        String s = mp.get(digits.charAt(idx));
        for(char ch:s.toCharArray()){
            helper(ans,mp,digits,idx+1,str+ch);
        }
    }
}