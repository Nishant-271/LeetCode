class Solution {
    public boolean isBipartite(int[][] graph) {
 int V=graph.length;
 int currentcolor=1;
  int color[]=new int[V];
 for(int i=0;i<V;i++){
    color[i]=-1;
 }

  HashMap<Integer,List<Integer>> map=new HashMap<>();
  for(int u=0;u<V;u++){
    List<Integer> neighbor=new ArrayList<>();
    for(int v=0;v<graph[u].length;v++){
        neighbor.add(graph[u][v]);
    }
    map.put(u,neighbor);
  }


 for(int u=0;u<V;u++){
    if(color[u]==-1){
        if(dfs(map,u,color,currentcolor)==false) return false;
    }
 }
 return true;
    }
public static boolean dfs(HashMap<Integer,List<Integer>> map,int u,int color[],int currentcolor){
    color[u]=currentcolor;
    if(map.containsKey(u)){
        for(int v:map.get(u)){
            if(color[v]==color[u]) return false;
            if(color[v]==-1){
                int color_of_v=1-color[u];
                if(dfs(map,v,color,color_of_v)==false){
                    return false;
                }
            }
        }
    }
return true;
}

}