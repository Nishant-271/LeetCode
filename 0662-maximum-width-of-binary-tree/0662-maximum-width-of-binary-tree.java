class Solution {
  class Pair{
    TreeNode node;
    int index;
    Pair(TreeNode node,int index){
        this.node=node;
        this.index=index;
    }
  }


    public int widthOfBinaryTree(TreeNode root) {
       Queue<Pair> q=new LinkedList<>();
       int maxwidth=0;
       
       q.add(new Pair(root,0));
 while(!q.isEmpty()){
   int size=q.size();
      int left=q.peek().index;
      int right=left;
 for(int i=0;i<size;i++){
    Pair current=q.remove();
    TreeNode node=current.node;
    int index=current.index;
right=index;
 if(node.left!=null){
    q.add(new Pair(node.left,2*index+1));
 }
 if(node.right!=null){
    q.add(new Pair(node.right,2*index+2));
 }
 }
 maxwidth=Math.max(maxwidth,right-left+1);
 }

return maxwidth;
    }
}