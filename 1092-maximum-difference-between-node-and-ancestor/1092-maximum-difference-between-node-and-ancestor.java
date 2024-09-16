class Solution {
//     static int max=0;
//     public int maxAncestorDiff(TreeNode root) {
//         max=0;
//        find(root);
    

// return max;
//     }

//  public static void find(TreeNode root){
//     if(root==null) return;
//     findmax(root,root.left);
//     findmax(root,root.right);

//      find(root.left);
//      find(root.right);

//  }


//  static void findmax(TreeNode root,TreeNode child){
//     if(root==null || child==null) return;
//     max=Math.max(max,Math.abs(root.val-child.val));

//     findmax(root,child.left);
//     findmax(root,child.right);
//  }

    public int maxAncestorDiff(TreeNode root) {
     return max(root,root.val,root.val);
     
    
    }

    public static int max(TreeNode root,int ma,int mi){
        if(root==null){
            return Math.abs(ma-mi);
        }

  ma=Math.max(ma,root.val);
  mi=Math.min(mi,root.val);
   int l=max(root.left,ma,mi);
   int r=max(root.right,ma,mi);

return Math.max(l,r);
    }
}