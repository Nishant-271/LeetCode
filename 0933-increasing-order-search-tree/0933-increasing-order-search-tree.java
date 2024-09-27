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
    List <Integer> a = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        in(root);
        TreeNode n = new TreeNode(0);
        TreeNode m = n;
        for(int i = 0; i < a.size() ; i++)
        {
            n.right = new TreeNode(a.get(i));
            n.left = null;
            n = n.right;
        }
        return m.right;
    }
    public void in(TreeNode root)
    {
        if(root == null) return;

        in(root.left);
        a.add(root.val);
        in(root.right);
    }
}