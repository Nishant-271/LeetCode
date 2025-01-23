class Solution {
    public boolean canFinish(int V, int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int indegree[]=new int[V];
        for(int [] edge:edges){
            int end=edge[0];
            int start=edge[1];

            if(!map.containsKey(start)){
                map.put(start,new ArrayList<>());
            }
            map.get(start).add(end);
            indegree[end]++;
        }
       int count=0;
       Queue<Integer> q=new LinkedList<>();
       for(int u=0;u<V;u++){
        if(indegree[u]==0){
            q.add(u);
            count++;
        }
       }
 
 while(!q.isEmpty()){
    int u=q.remove();
    if(map.containsKey(u)){
    for(int nbr:map.get(u)){
        indegree[nbr]--;
        if(indegree[nbr]==0){
            q.add(nbr);
            count++;
        }
    }
    }
 }

return count==V;
    }
}