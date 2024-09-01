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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int curr=1;
        if(root==null) return null;
        if(depth==1){
            TreeNode nn=new TreeNode(val);
            nn.left=root;
        return nn;
        }
    return  print(root,val,depth,curr);
    }
public static TreeNode print(TreeNode root,int val,int depth,int curr){
        if(root==null) return null;
   if(curr==depth-1){
           TreeNode left= root.left;
           TreeNode right= root.right;
         
           root.left=  new TreeNode(val);
           root.right=  new TreeNode(val);
           root.left.left=left;
           root.right.right=right;
           return root;
   }
   root.left=print(root.left,val,depth,curr+1);
   root.right=print(root.right,val,depth,curr+1);

return root;

}

}