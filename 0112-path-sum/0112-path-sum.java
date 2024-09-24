class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root==null) return false;
       return bool(root,targetSum);
         }
         public static boolean bool(TreeNode root,int target){
            if(root==null) return false;
            if(root.left==null && root.right==null) return target-root.val==0;

            return bool(root.left,target-root.val) || bool(root.right,target-root.val);
         }
}