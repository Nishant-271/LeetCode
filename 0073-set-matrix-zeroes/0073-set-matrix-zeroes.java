// BRUTE FORCE ::
// class Solution {
//     public void setZeroes(int[][] mat) {
//         // BRUTE FORCE IN TIME COMPLEXITY OF ALMOST N CUBE 
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 if(mat[i][j]==0){
//                     markrow(i,mat);
//                     markcol(j,mat);
//                 }
//             }

    
//         }      
//        for(int k=0;k<mat.length;k++){
//         for(int r=0;r<mat[0].length;r++){
//             if(mat[k][r]==-1){
//                 mat[k][r]=0;
//             }
//         }
//        }
// }
//   public static void markrow(int i,int mat[][]){
//     for(int j=0;j<mat[0].length;j++){
//         if(mat[i][j]!=0){
//             mat[i][j]=-1;
//         }
//     }
//   }
 
//   public static void markcol(int j,int mat[][]){
//     for(int i=0;i<mat.length;i++){
//         if(mat[i][j]!=0){
//             mat[i][j]=-1;
//         }
//     }
//   }

// }

// BETTER SOLUTION ::::::

class Solution {
    public void setZeroes(int[][] mat) {
       boolean row[]=new boolean[mat.length];
       boolean col[]=new boolean[mat[0].length];
 for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
        if(mat[i][j]==0){
            row[i]=true;
            col[j]=true;
        }
    }
 }

 for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
        if(row[i] || col[j]){
            mat[i][j]=0;
        }
    }
 }

    }

    

    }