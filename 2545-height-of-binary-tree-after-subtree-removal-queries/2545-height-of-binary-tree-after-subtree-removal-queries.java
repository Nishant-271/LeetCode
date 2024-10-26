class Solution {
    HashMap<Integer,PriorityQueue<int[]>>hash;
    HashMap<Integer,Integer>l;
    public int[] treeQueries(TreeNode root, int[] queries) {
        hash = new HashMap<>();
        l = new HashMap<>();
        solve(root,0);
        int res[] = new int[queries.length];
        for(int i=0;i<res.length;i++){
            PriorityQueue<int[]>p = new PriorityQueue<>(hash.get(l.get(queries[i])));
            // System.out.println(p.peek()[0]+" "+p.peek()[1]);
            if(p.size()==1)
                res[i] = l.get(queries[i])-1;
            else if(p.peek()[0]!=queries[i])
                res[i] = p.peek()[1];
            else{
                p.poll();
                res[i] = p.peek()[1];
            }
        }
        return res;
    }
    public int solve(TreeNode root,int h){
        if(root==null)
            return h-1;
        l.put(root.val,h);
        int a = solve(root.left,h+1);
        int b = solve(root.right,h+1);
        if(!hash.containsKey(h)){
            hash.put(h,new PriorityQueue<>((c,d)->d[1]-c[1]));
        }
        hash.get(h).add(new int[]{root.val,Math.max(a,b)});
        return Math.max(a,b);
    }
}