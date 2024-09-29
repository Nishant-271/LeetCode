class Solution {
    public boolean canFinish(int V, int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int []edge:edges){
           int end=edge[0];
           int start=edge[1];
        if(!map.containsKey(start)){
            map.put(start,new ArrayList<>());
        }
        map.get(start).add(end);
        }
        boolean [] visited=new boolean[V];
        boolean [] current=new boolean[V];
   for(int u=0;u<V;u++){
    if(!visited[u]){
        if(dfs(map,visited,current,u)){
return false;
        }
    }
   }

return true;
    }

public static boolean dfs(HashMap<Integer,List<Integer>> map,boolean visited[],boolean current[],int start){
    visited[start]=true;
    current[start]=true;
  if(map.containsKey(start)){
    for(int nn:map.get(start)){
        if(!visited[nn]){
            if(dfs(map,visited,current,nn)) return true;
        }
        else{
            if(current[nn]==true){
                return true;
            }
        }
    }
  }
  current[start]=false;
return false;
}
}