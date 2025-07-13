class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshaped=new int[r][c];
        if(mat.length*mat[0].length!=r*c)return mat;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshaped[i][j]=list.get(index++);
            }
        }
        return reshaped;   
    }
}

//optimal
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (n * m != r * c) return mat;  // reshape not possible
        int [][] ans = new int[r][c];

        int k = 0;
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<m ;j++){
                 ans[k / c][k % c] = mat[i][j];
                k++;
            }
        }
        return ans;
    }
}
