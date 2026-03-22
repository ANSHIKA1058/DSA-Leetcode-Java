class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int r=0;r<4;r++){
            if(isSame(mat,target,n)){
                return true;
            }
            else{
                rotate90(mat,n);
            }
        }
        return false;
    }
    public boolean isSame(int[][] mat, int[][] target,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;

    }
    public void rotate90(int[][] mat,int n ){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }
    }
}