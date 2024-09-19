class Solution {
    static int maxpath=0;
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
         maxpath=0;
        boolean goleft=true;
        int steps=0;
        solve(root,steps,true);
        solve(root,steps,false);

return maxpath;

    }
public static void solve(TreeNode root,int steps,boolean goleft){
    if(root==null) return ;
       maxpath=Math.max(maxpath,steps);

    if(goleft){ // left side jana hai 
        solve(root.left,steps+1,false);
        solve(root.right,1,true);
    }else{ // right side jana hai
         solve(root.right,steps+1,true);
         solve(root.left,1,false);
    }
}


}