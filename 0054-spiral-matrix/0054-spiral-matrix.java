class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
   List<Integer> list=new ArrayList<>();

   int left=0; int top=0;
   int right=mat[0].length-1; int bottom=mat.length-1;

 while(left<=right  && top<=bottom){
//   right direction me top constant
 for(int i=left;i<=right;i++){
    list.add(mat[top][i]);
 }
 top++;


//   bottom direction me right constant
 for(int i=top;i<=bottom;i++){
    list.add(mat[i][right]);
 }

 right--;

if(top<=bottom){
//   left direction me bottom constant
 for(int i=right;i>=left;i--){
    list.add(mat[bottom][i]);
 }

 bottom--;
}

if(left<=right){
//   topward direction me left constant
 for(int i=bottom;i>=top;i--){
    list.add(mat[i][left]);
 }

 left++;
 
}

 } 

return list;

    }
} 