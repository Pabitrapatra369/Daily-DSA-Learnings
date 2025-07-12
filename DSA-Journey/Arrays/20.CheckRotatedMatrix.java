class Solution {
    public boolean isEqual(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                if (mat1[i][j] != mat2[i][j])
                    return false;
            }
        }
        return true;
    }

    public int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][] rotated=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=mat[i][j];
            }
        }
        return rotated;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        boolean ans=false;

        for(int i=0;i<4;i++){
            mat=rotate(mat);
            ans=isEqual(mat,target);
            if(ans)break;
        }
        return ans;
    }
}
//Optimal
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        int [] rotate= new int[4];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(target[i][j] == mat[i][j]) {
                    rotate[0]++;
                } if(target[i][j] == mat[n - j - 1][i]) {
                    rotate[1]++;
                } if(target[i][j] == mat[n - i - 1][n - j - 1]) {
                    rotate[2]++;
                } if(target[i][j] == mat[j][n - i - 1]) {
                    rotate[3]++;
                }
            }
        }

        for(int i = 0; i < 4; i++) {
            if(rotate[i] == n * n) return true;
        }

        return false;
    }
}
