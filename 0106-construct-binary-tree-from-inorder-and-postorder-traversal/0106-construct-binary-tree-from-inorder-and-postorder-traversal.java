class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       int n=postorder.length;
       int idx[]={n-1};
       return solve(inorder,postorder,0,n-1,idx);
 }
 
 public static TreeNode solve(int []inorder,int[]postorder,int start,int end,int idx[]){
    if(start>end) return null;

    int rootval=postorder[idx[0]];
    int i=start;
    for(;i<=end;i++){
        if(inorder[i]==rootval){
            break;
        }
    }
 TreeNode root=new TreeNode(rootval);
 idx[0]--;

  root.right=solve(inorder,postorder,i+1,end,idx);
  root.left=solve(inorder,postorder,start,i-1,idx);


return root;
 }

}