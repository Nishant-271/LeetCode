/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        static int count=0;
    public int countNodes(TreeNode root) {
        count=0;
         inorder(root);
     return count;
    }
    public static void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        count++;
        inorder(root.right);

    }

}