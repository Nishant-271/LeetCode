class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
   List<Integer> del=new ArrayList<>();        
   List<TreeNode> ans=new ArrayList<>();        

  for(int i:to_delete){
        del.add(i);  }
if(!del.contains(root.val)){
    ans.add(root);
}


    dfs(root,del,ans);

    return ans;   
    }
  public static TreeNode dfs(TreeNode root,List<Integer>del,List<TreeNode>ans){
    if(root==null) return null;

    root.left=dfs(root.left,del,ans);
    root.right=dfs(root.right,del,ans);
 if(del.contains(root.val)){
    if(root.left!=null) ans.add(root.left);
    if(root.right!=null) ans.add(root.right);
 
 return null;
 }


return root;
  }



}