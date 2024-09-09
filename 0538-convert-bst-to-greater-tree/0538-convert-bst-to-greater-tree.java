class Solution {
 static int sum=0;
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        reverseinorder(root); 
        // to replace the value with sum in descending order we will 
        // travel from right and then root and then left
    return root;
    
    }
    public static void reverseinorder(TreeNode root){
        if(root==null) return ;

          reverseinorder(root.right);
          sum+=root.val;
          root.val=sum;
          reverseinorder(root.left);

    }
}