class Solution {
    public boolean isCompleteTree(TreeNode root) {
      int j=countallnodes(root);
      int i=1;
      return check(root,i,j);
}

 public static int countallnodes(TreeNode root){
    if(root==null) return 0;
    return 1+countallnodes(root.left)+countallnodes(root.right);
 }

 public static boolean check(TreeNode root,int i,int count){
    if(root==null) return true;
    if(i>count) return false;

    return check(root.left,2*i,count) && check(root.right,2*i+1,count);
 }

}