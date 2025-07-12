class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
           int minInRow=Integer.MAX_VALUE;
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<minInRow){
                    minInRow=matrix[i][j];
                    col=j;
                }
            }

            int maxInCol=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][col]>maxInCol)maxInCol=matrix[j][col];
            }
            if(minInRow==maxInCol)list.add(minInRow);
        }
        return list;
    }
}
