class Solution {
     List<Integer> ans;
    public List<Integer> largestValues(TreeNode root) {
        ans = new ArrayList<>();
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode node, int l) {
        if(node != null) {
            int v = node.val;
            if(l == ans.size()) {
                ans.add(v);
            } else {
                ans.set(l, Math.max(ans.get(l), v));
            }
            dfs(node.left, l + 1);
            dfs(node.right, l + 1);
        }
    }
}