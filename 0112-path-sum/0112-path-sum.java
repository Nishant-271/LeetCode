class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
   if(root==null) return false;
   return func(root,targetSum);        
    }
public static boolean func(TreeNode root,int k){
    if(root==null) return false;
    if(root.left==null && root.right==null) return (k-root.val)==0;
    return func(root.left,k-root.val)|| func(root.right,k-root.val);
}

}