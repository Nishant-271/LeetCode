class Solution {
    public boolean canFinish(int V, int[][] edges) {
        
        /* Approch topological sort jaise concept hai 
        directed graph me cycle dekh lenge agar cycle hogi toh return false else return true;
*/
HashMap<Integer,List<Integer>> map=new HashMap<>();
        boolean visited[]=new boolean[V];
        boolean current[]=new boolean[V];
       for(int []edge:edges){
        int end=edge[0];
        int start=edge[1];
        if(!map.containsKey(start)){
            map.put(start,new ArrayList<>());
        }
        map.get(start).add(end);
       }

 for(int u=0;u<V;u++){
      if(!visited[u]){
        if(dfs(map,visited,current,u)){
            return false;
        }
      }
      
 }

return true;
    }
public static boolean dfs(HashMap<Integer,List<Integer>>map,boolean visited[],boolean current[],int node){
    visited[node]=true;
     current[node]=true;
 if(map.containsKey(node)){
   for(int nn:map.get(node)){
    if(!visited[nn]){
        if(dfs(map,visited,current,nn)) return true;
    }
 else{
    if(visited[nn]==true &&  current[nn]==true){
        return true;
    }
 }
   }
 }

 current[node]=false;
 return false;

}

}