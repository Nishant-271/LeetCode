class Solution {
     List<Integer> ll=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
     inorder(root,k,ll);
     return ll.get(k-1);

    }
   private void inorder(TreeNode root,int k,List<Integer>ll){
        if(root==null) return;
            
        inorder(root.left,k,ll);
        ll.add(root.val);
        inorder(root.right,k,ll);
    }
}