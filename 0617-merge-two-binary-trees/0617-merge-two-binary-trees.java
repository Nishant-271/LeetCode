class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
       if(root1==null) return root2;
       if(root2==null) return root1;

       TreeNode newroot=new TreeNode(root1.val+root2.val);
       merge(newroot,root1,root2);

       return newroot;
    }
  public static void merge(TreeNode root,TreeNode root1,TreeNode root2){
  
  if(root1.left!=null || root2.left!=null){
     if(root1.left==null){
        root.left=root2.left;
     }
     else if(root2.left==null){
        root.left=root1.left;
     }
   else{
    TreeNode newLeft=new TreeNode(root1.left.val+root2.left.val);
    root.left=newLeft;
    merge(root.left,root1.left,root2.left);
  }
  }

  if(root1.right!=null || root2.right!=null){
     if(root1.right==null){
        root.right=root2.right;
     }
     else if(root2.right==null){
        root.right=root1.right;
     }
   else{
   
    TreeNode newRight=new TreeNode(root1.right.val+root2.right.val);
    root.right=newRight;
    merge(root.right,root1.right,root2.right);
  }
  }
  }

}