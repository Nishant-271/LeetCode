class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
  if(root==null) return arr;
Queue<TreeNode> q=new LinkedList<>();
 q.add(root);
 while(!q.isEmpty()){
    int n=q.size();
    List<Integer> curr=new ArrayList<>();
    for(int i=0;i<n;i++){
        TreeNode k=q.remove();
        curr.add(k.val);
        if(k.left!=null) q.add(k.left);
        if(k.right!=null) q.add(k.right);
    }
    arr.add(curr.get(curr.size()-1));
 }
return arr;
    }
}