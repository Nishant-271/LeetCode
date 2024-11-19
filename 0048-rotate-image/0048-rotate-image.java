class Solution {
    public void rotate(int[][] mat) {
//  BRUTE FORCE WE HAVE TO UPDATE THE ORIGINAL ONE ::      
          
//   int n=matrix.length;
//   int ans[][]=new int[n][n];

//   for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         ans[j][n-1-i]=matrix[i][j];
//     }
//   }

//   for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//     matrix[i][j]=ans[i][j]   ;   
//     }
//   }

  

//  BETTER ONE FIRST WE WILL TRANSPOSE BY USING THE UPPER HALF AFTER THAT REVERSE EACH SECTION :

    int n=mat.length;

    //  transpose ::
    for(int i=0;i<=n-2;i++){
        for(int j=i+1;j<n;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
    }

//   reverse ::
    for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[i][n-1-j];
            mat[i][n-1-j]=temp;
        }
    }




    }
}