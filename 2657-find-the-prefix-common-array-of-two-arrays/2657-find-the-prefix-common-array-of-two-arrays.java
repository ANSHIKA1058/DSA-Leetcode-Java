class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        HashSet<Integer> stA = new HashSet<>();
        HashSet<Integer> stB = new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){

            stA.add(A[i]);
            stB.add(B[i]);
            if(stB.contains(A[i])){
                count++;
            }
            if(stA.contains(B[i]) && A[i]!=B[i]){
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}