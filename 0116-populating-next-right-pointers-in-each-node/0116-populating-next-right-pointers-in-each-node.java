/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Map<Integer,Node> map=new HashMap<>();
        dfs(root,map,0);
        return root;
    }
    public void dfs(Node root,Map<Integer,Node> map,int depth){
        if(root==null){
            return ;
        }
        if(map.containsKey(depth)){
            map.get(depth).next=root;
        }
        map.put(depth,root);
        dfs(root.left,map,depth+1);
        dfs(root.right,map,depth+1);
    }
}