class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> result=new ArrayList<>();
    if(root==null) return result;
    Queue<TreeNode> q=new LinkedList<>();

    q.add(root);
    while(!q.isEmpty()){
        int size=q.size();
        List<Integer> curr=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode k=q.remove();
            curr.add(k.val);
            if(k.left!=null) q.add(k.left);
            if(k.right!=null) q.add(k.right);
        }
        result.add(curr);
    }

Collections.reverse(result);

   return result;
   
    }

}