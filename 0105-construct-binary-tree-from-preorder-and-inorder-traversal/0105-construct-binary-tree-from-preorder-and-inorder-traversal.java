class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length-1;
        int idx[]={0};
       return build(preorder,inorder,0,n,idx);
    }
public static TreeNode build(int [] preorder,int []inorder,int start,int end,int idx[]){
if(start>end) return null;

int rootval=preorder[idx[0]];
int i=start;
for(;i<=end;i++){
    if(inorder[i]==rootval){
        break;
    }
}
TreeNode root=new TreeNode(rootval);
idx[0]++;
 root.left=build(preorder,inorder,start,i-1,idx);
 root.right=build(preorder,inorder,i+1,end,idx);

return root;
}



}