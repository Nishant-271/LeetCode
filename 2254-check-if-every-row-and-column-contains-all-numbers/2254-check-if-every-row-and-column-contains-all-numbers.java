class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<Integer> st=new HashSet<>();
       int n=matrix.length;   for(int i=1;i<=n;i++)  st.add(i);
        for(int i=0;i<n;i++){
            HashSet<Integer> row=new HashSet<>();
            HashSet<Integer> col=new HashSet<>();
            for(int j=0;j<n;j++){
               row.add(matrix[i][j]); 
               col.add(matrix[j][i]); }
            if(!st.equals(row)|| !st.equals(col)){
                return false;
            }
        }

return true;
    }
}