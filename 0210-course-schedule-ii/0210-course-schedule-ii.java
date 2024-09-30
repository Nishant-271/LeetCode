class Solution {
    public int[] findOrder(int V, int[][] edges) {
//  inputs ::
        boolean visited[]=new boolean[V]; 
        boolean current[]=new boolean[V]; 
       HashMap<Integer,List<Integer>> map=new HashMap<>();
       Stack<Integer> st=new Stack<>();
 // making of graph:
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
        if(dfs(map,visited,current,u,st)){ 
           return new int[0];
        }
    }
 }

 int result[]=new int[st.size()];
 int i=0;
 while(!st.isEmpty()){
    result[i++]=st.pop();
 }

return result;

    }

public static boolean dfs(HashMap<Integer,List<Integer>> map,boolean visited[],boolean current[],int u,Stack<Integer> st){
    visited[u]=true;
    current[u]=true;
    if(map.containsKey(u)){
        for(int v:map.get(u)){
            if(!visited[v]){
                if(dfs(map,visited,current,v,st)) return true;
            }
            else{
                if(visited[v]==true && current[v]==true) return true;
            }
        }
    }
st.push(u);
current[u]=false;
return false;
}

}