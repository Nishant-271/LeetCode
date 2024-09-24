class Solution {
    public TreeNode pruneTree(TreeNode root) {
 if(root==null) return null;

 if(!onepresent(root.left)){
    root.left=null;
 }
if(!onepresent(root.right)){
    root.right=null;
}

pruneTree(root.left);
pruneTree(root.right);

if(root.left==null && root.right==null && root.val==0) return null;

 
 return root;
    }
public static boolean onepresent(TreeNode root){
    if(root==null) return false;
    if(root.val==1) return true;
    return onepresent(root.left) || onepresent(root.right);

}


}