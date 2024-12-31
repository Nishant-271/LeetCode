class Solution {
    static String result="";
    public String smallestFromLeaf(TreeNode root) {
        result="";
         dfs(root,"");
         
         return result;
    }
    static void dfs(TreeNode root,String curr){
        if(root==null) return;
        
            curr=(char)(root.val+'a') +curr;
        if(root.left==null && root.right==null){
            if(result=="" || curr.compareTo(result)<0){
                result=curr;
            }
            return;
        }
         dfs(root.left,curr);
         dfs(root.right,curr);
    }
}