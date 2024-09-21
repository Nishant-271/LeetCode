class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans=new ArrayList<>();
        List<Integer> del=new ArrayList<>();
    for(int num:to_delete){
        del.add(num);
    }
   func(root,del,ans);
    if(!del.contains(root.val)){
        ans.add(root);
    }
   return ans;
    }

public static TreeNode func(TreeNode root,List<Integer> del,List<TreeNode> ans){
    if(root==null) return null;

    root.left=func(root.left,del,ans);
    root.right=func(root.right,del,ans);

  if(del.contains(root.val)){ // agar aisa hai toh node delete krni hai 
    if(root.left!=null) ans.add(root.left); // left node as new root add to ans list
    if(root.right!=null) ans.add(root.right); //right node as new root add to ans list
return null;
  }

 return root;


}

}