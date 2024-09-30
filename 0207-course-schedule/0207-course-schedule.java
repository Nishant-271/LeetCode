class Solution {
    public boolean canFinish(int V, int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
    int indegree[]=new int[V];
        for(int []edge:edges){
           int end=edge[0];
           int start=edge[1];
        if(!map.containsKey(start)){
            map.put(start,new ArrayList<>());
        }
        map.get(start).add(end);
        indegree[end]++;
     }

    Queue<Integer> q=new LinkedList<>();
  int count=0;
 for(int u=0;u<V;u++){
    if(indegree[u]==0){
        q.add(u);
        count++;
    }
 }

  
while(!q.isEmpty()){
    int u=q.remove();
    if(map.containsKey(u)){
    for(int v:map.get(u)){
        indegree[v]--;
        if(indegree[v]==0){
            q.add(v);
            count++;
        }
    }}
}
 
 if(count==V) return true;
 return false;
 
    }

}