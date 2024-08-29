class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      int start=0; int end=nums.length-1;
     return  create(nums,start,end);
    }

 TreeNode create(int []nums,int start,int end){
        if(start>end){
            return null;
        }
         int mid=((end-start)+1)/2+start;
      TreeNode root=new TreeNode(nums[mid]);
          root.left=create(nums,start,mid-1);
          root.right=create(nums,mid+1,end);
          return root;
          
          
          }
}