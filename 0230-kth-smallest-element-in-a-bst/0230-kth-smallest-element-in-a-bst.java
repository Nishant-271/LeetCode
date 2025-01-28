class Solution {
     List<Integer> ll=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
     inorder(root);
     return ll.get(k-1);

    }
   private void inorder(TreeNode root){
        if(root==null) return;
            
        inorder(root.left);
        ll.add(root.val);
        inorder(root.right);
    }
}