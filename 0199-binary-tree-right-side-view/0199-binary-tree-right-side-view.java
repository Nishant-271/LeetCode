class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
       solve(root,arr,1);
        return arr;
    }
    public static void solve(TreeNode root,List<Integer>arr,int level){
        if(root==null) return ;
        if(arr.size()<level){
            arr.add(root.val);
        }
      solve(root.right,arr,level+1);
      solve(root.left,arr,level+1);

    }
}