/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode k=q.remove();
                curr.add(k.val);
                if(k.left!=null) q.add(k.left);
                if(k.right!=null) q.add(k.right);
            }
        long sum=0;
        for(int i:curr){
            sum+=i;
        }

        double average=(double)sum/curr.size();

arr.add(average);
        }
        return arr;
    }
}