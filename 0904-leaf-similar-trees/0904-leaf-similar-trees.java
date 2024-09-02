class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      StringBuilder s1=new StringBuilder(); 
      StringBuilder s2=new StringBuilder(); 
      preorder(root1,s1); 
      System.out.print(s1);
      preorder(root2,s2); 
      System.out.print(s2);
     return s1.toString().equals(s2.toString());
     }

     public static void preorder(TreeNode root,StringBuilder s){
        if(root==null) return;
        if(root.left==null && root.right==null){
           s.append(root.val).append("_");
           return;
        }
        preorder(root.left,s);
        preorder(root.right,s);
     }

}