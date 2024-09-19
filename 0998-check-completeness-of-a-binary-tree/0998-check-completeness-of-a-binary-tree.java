
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean past=false;
        while(!q.isEmpty()){
      TreeNode k=q.remove();
      if(k==null) past=true;
      else{
        if(past) return false;
        else{
            q.add(k.left);
            q.add(k.right);
        }
      }
        }
 return true;
    }
}