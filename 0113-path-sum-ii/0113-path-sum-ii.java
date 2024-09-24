class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
  List<List<Integer>> result=new ArrayList<>();
  List<Integer> current=new ArrayList<>();
int sum=0;
 solve(root,targetSum,result,current,sum);
return result;
    }

public static void solve(TreeNode root,int target,List<List<Integer>> result,List<Integer>current,int sum){
    if(root==null) return;
    sum+=root.val;
    current.add(root.val);
    // leaf node

if(root.left==null && root.right==null){
    if(sum==target){
        result.add(new ArrayList<>(current));
    }
}

solve(root.left,target,result,current,sum);
solve(root.right,target,result,current,sum);

current.remove(current.size()-1);
}

}