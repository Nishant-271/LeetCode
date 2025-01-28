class Solution {
    public int findMaxFish(int[][] grid) {
    int max=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
         if(grid[i][j]>0){
         int sum=dfs(i,j,grid);
         max=Math.max(max,sum);

         }
        }
    }      
return max;

    }

public static int dfs(int row,int col,int grid[][]){
    if(row<0 || row==grid.length || col<0 || col==grid[0].length || grid[row][col]==0)
    return 0;

    int sum=grid[row][col];
    grid[row][col]=0;

   sum+=    dfs(row+1,col,grid);
    sum+=dfs(row-1,col,grid);
   sum+= dfs(row,col+1,grid);
    sum+=dfs(row,col-1,grid);


    return sum;
}

}