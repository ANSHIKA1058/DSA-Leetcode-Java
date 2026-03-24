class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int sum = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    row.add(sum);
                }

            }
            result.add(row);
        }
        return result;
    }
}