class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
             List<TreeNode> le=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current=q.remove();
                le.add(current);
                if(current.left!=null) q.add(current.left); 
                if(current.right!=null) q.add(current.right); 
            }
        if(level%2!=0){
           int left=0,right=le.size()-1;
         while(left<right){
            int temp=le.get(left).val;
            le.get(left).val=le.get(right).val;
            le.get(right).val=temp;
            left++;
            right--;
         }
        
        }
        level++;
        }    
       
    return root;
    }
}