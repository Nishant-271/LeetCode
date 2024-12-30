
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
    List<Integer> ll=new ArrayList<>();
         inorder(root1,ll);
         inorder(root2,ll);
        Collections.sort(ll);
        return ll;
    }

 public static void inorder(TreeNode root,List<Integer> ll){
    if(root==null) return ;

    inorder(root.left,ll);
    ll.add(root.val);
    inorder(root.right,ll);
 }


}