class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       HashMap<Integer,List<Integer>> map=new HashMap<>();
       for(int edge[]:edges){
        int u=edge[0];
        int v=edge[1];
        if(!map.containsKey(u)){
            map.put(u,new ArrayList<>());
        }
        map.get(u).add(v);
        
        if(!map.containsKey(v)){
            map.put(v,new ArrayList<>());
        }
        map.get(v).add(u);

       boolean visited[]=new boolean[edges.length+1];
         if(dfs(map,u,v,visited)){
            return edge;
         }

       }

return new int[0];
    }
public static boolean dfs(HashMap<Integer,List<Integer>>map,int start,int parent,boolean visited[]){
    visited[start]=true;
    if(map.containsKey(start)){
        for(int nn:map.get(start)){
            if(nn==parent) continue;
            if(visited[nn]) return true;
            if(dfs(map,nn,start,visited)) return true;
        }
    }
return false;
}

}