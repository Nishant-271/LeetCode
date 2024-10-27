class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;// row
        int n=matrix[0].length;// column
        int c=0;// count square  submatrices have all ones
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1 && i>0 && j>0){// if it has 1 
                    matrix[i][j]=Math.min(matrix[i-1][j-1],Math.min(matrix[i][j-1],matrix[i-1][j]))+1;// calculate
                }
                c=c+matrix[i][j];// increment your count
            }
        }
        return c;// return count
        
    }
}