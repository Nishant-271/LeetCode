class Solution {
    public int findBottomLeftValue(TreeNode root) {
 if(root==null) return 0;
 Queue<TreeNode> q=new LinkedList<>();
int val=0;
 q.add(root);
 while(!q.isEmpty()){
 int size=q.size();
 List<Integer> arr=new ArrayList<>();
 for(int i=0;i<size;i++){
    TreeNode current=q.remove();
     arr.add(current.val);
     if(current.left!=null) q.add(current.left);
     if(current.right!=null) q.add(current.right);
 }
      
System.out.print(arr);
val=arr.get(0);
 }
return val;
    }
}