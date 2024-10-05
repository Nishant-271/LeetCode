class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int color[]=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        int currentcolor=1;
        for(int u=0;u<V;u++){
            if(color[u]==-1){
                if(bfs(graph,u,color,currentcolor)==false) return false;
            }
        }
    return true;
    }
    public static boolean bfs(int[][]graph,int node,int[]color,int currentcolor){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=currentcolor;
        while(!q.isEmpty()){
            int u=q.remove();
            for(int v:graph[u]){
                if(color[v]==color[u]) return false;
                if(color[v]==-1){
                    // usko diffrent color deke q me daal dunga 
                    color[v]=1-color[u];
                    q.add(v);
                }
            }
        }
 return true;
    }
}