class Solution {
//  BY BFS ::

//     public boolean isCompleteTree(TreeNode root) {
//         if(root==null) return true;
//     Queue<TreeNode> q=new LinkedList<>();
//      boolean past=false;
//     q.add(root);
//           while(!q.isEmpty()){
//             TreeNode k=q.remove();
//             if(k==null){ past=true; }
//             else{
//                 if(past==true){ return false;}
//             q.add(k.left); q.add(k.right);
//             }
//           }
//   return true;
//     }


// BY DFS 
    public boolean isCompleteTree(TreeNode root) {
   int j=  countNodes(root);
     int i=1;
     return complete(root,i,j);
    
    }

    // count nodes
    public static int countNodes(TreeNode root){
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }

 public static boolean complete(TreeNode root,int i,int count){
    if(root==null) return true;
    if(i>count) return false;

    return complete(root.left,2*i,count) && complete(root.right,2*i+1,count);
 }

}