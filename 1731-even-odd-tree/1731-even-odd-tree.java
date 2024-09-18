class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        boolean even=true;
        q.add(root);
        while(!q.isEmpty()){
        int prev;
            int n=q.size();
          if(even){ 
            // level even hai toh values odd honi chahiye voh bhi increasing order me
             prev=Integer.MIN_VALUE;
          }
           else{ 
            // level odd hai toh values even honi chahiye voh bhi decreasing order me
             prev=Integer.MAX_VALUE;
           }
        for(int i=0;i<n;i++){
            TreeNode curr=q.remove();
            if(even && (curr.val%2==0 || curr.val<=prev)) return false;
            if(!even && (curr.val%2!=0 || curr.val>=prev)) return false;

            prev=curr.val;
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        even=!even;
        }
        return true;
    }
}