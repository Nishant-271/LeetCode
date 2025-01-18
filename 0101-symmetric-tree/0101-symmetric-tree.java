class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return mirror(root.left,root.right);
    }
    public static boolean  mirror(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null || root1.val!=root2.val) return false;
        return mirror(root1.left,root2.right) && mirror(root1.right,root2.left);
    }
}