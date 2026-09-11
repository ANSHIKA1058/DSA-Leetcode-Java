class Solution {
    ArrayList<Integer> list = new ArrayList<>();

    public int totalNumbers(int[] digits) {
        Arrays.sort(digits);
        int n = digits.length;
        boolean[] used = new boolean[n];
        backtrack(digits,used,0,0);
        return list.size();
    }
    void backtrack(int[] digits, boolean[] used, int count, int num){
        if(count==3){
                if(!list.contains(num)){
                    list.add(num);
                }
            
            return;
        }

        for(int i=0;i<digits.length;i++){
             if(used[i]) continue;

             if(i>0 && digits[i]==digits[i-1] && !used[i-1]) continue;

             if(count==0  && digits[i]==0) continue;

             if(count==2 && digits[i]%2!=0) continue;

             used[i]=true;
             backtrack(digits,used,count+1,num*10+digits[i]);
             used[i]=false;

        }


    }

}