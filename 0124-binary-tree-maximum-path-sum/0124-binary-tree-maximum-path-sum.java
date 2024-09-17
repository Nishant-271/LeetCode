class Solution {
   static  int maxwidth=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       maxwidth=Integer.MIN_VALUE;
//        if(root.left==null && root.right==null){
//  return root.val;
// }
//        if(root.left==null && root.right!=null){
//        solve(root.right);
// }
//        if(root.left!=null && root.right==null){
//        solve(root.left);
// }
//        if(root.left!=null && root.right!=null){
//        solve(root);
// }

       solve(root);
return maxwidth;

    }

 public static int solve(TreeNode root){
    if(root==null) return 0;

   int left=solve(root.left);
   int right=solve(root.right);
 
//  case 1  left aur right dono path acha hona 
  int niche_milgya=left+right+root.val;
//   case 2 : left ya right me se ek path acha hona 
  int ek_acha_niche=Math.max(left,right)+root.val;
// case 3 : left aur right dono hi acha path
  int dono_na_ache=root.val;
   int mm=Math.max(maxwidth,Math.max(niche_milgya,ek_acha_niche));

  maxwidth=Math.max(maxwidth,Math.max(mm,dono_na_ache));

 return Math.max(ek_acha_niche,dono_na_ache);
 }


}