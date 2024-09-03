class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k = original.length;
        int[][] a = new int[m][n];
        if(k != n*m) return new int[0][0];
        for(int i = 0; i < m*n ; i++){
            a[i/n][i%n] = original[i];
        }
        return a;
    }
}