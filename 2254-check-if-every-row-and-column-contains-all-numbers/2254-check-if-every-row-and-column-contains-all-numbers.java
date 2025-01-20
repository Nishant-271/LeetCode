class Solution {
    public boolean checkValid(int[][] matrix) {
//  BRUTE FORCE :::::

//         HashSet<Integer> st=new HashSet<>();
//        int n=matrix.length;   for(int i=1;i<=n;i++)  st.add(i);
//         for(int i=0;i<n;i++){
//             HashSet<Integer> row=new HashSet<>();
//             HashSet<Integer> col=new HashSet<>();
//             for(int j=0;j<n;j++){
//                row.add(matrix[i][j]); 
//                col.add(matrix[j][i]); }
//             if(!st.equals(row)|| !st.equals(col)){
//                 return false;
//             }
//         }

// return true;

//   ANOTHER WAY :::::::::
  int n=matrix.length;
  for(int i=0;i<n;i++){
    int row[]=new int[n+1], col[]=new int[n+1];
  for(int j=0;j<n;j++){
    row[matrix[i][j]]++;
    col[matrix[j][i]]++;
  }
 for(int k=1;k<=n;k++){
    if(row[k]>1  || col[k]>1) return false;
  }
  }




return true;
    }
}