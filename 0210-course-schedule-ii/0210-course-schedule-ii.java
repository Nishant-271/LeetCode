class Solution {
    public int[] findOrder(int V, int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
      int [] indegree=new int[V];
      int result[]=new int[V];
    //   GRAPH MAKING AND INDEGREE ARRAY 
      for(int edge[] : edges){
        int end=edge[0];
        int start=edge[1];
       if(!map.containsKey(start)){
        map.put(start,new LinkedList<>());
       }
       map.get(start).add(end);
       indegree[end]++;
      }
 
 Queue<Integer> q=new LinkedList<>();
 int count=0; int i=0;
 for(int u=0;u<V;u++){
    if(indegree[u]==0){
        count++;
        q.add(u);
        result[i++]=u;
    }
 }

while(!q.isEmpty()){
    int u=q.remove();
    if(map.containsKey(u)){
        for(int v:map.get(u)){
            indegree[v]--;
            if(indegree[v]==0){
                count++;
                q.add(v);
                result[i++]=v;
            }
        }
    }
}
 
 if(count==V){
    return result;
 }
 return new int[0];
    }
}