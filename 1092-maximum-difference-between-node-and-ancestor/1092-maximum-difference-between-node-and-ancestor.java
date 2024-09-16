class Solution {
    static int max=0;
    public int maxAncestorDiff(TreeNode root) {
        max=0;
       find(root);
    

return max;
    }

 public static void find(TreeNode root){
    if(root==null) return;
    findmax(root,root.left);
    findmax(root,root.right);

     find(root.left);
     find(root.right);

 }


 static void findmax(TreeNode root,TreeNode child){
    if(root==null || child==null) return;
    max=Math.max(max,Math.abs(root.val-child.val));

    findmax(root,child.left);
    findmax(root,child.right);
 }


}