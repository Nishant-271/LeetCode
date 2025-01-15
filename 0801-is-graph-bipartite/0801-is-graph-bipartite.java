class Solution {

  class Pair{
    int v; int d;
    public Pair(int v,int d){
        this.v=v;
        this.d=d;
    }
  }

    public boolean isBipartite(int[][] graph) {
        Queue<Pair> q=new LinkedList<>();
        HashMap<Integer,Integer> visited=new HashMap<>();
       for(int v=0;v<graph.length;v++){
       
       if(visited.containsKey(v)){
        continue;
       }
       q.add(new Pair(v,0));
       
        // bfs
       
        while(!q.isEmpty()){
            // 1. Remove
            Pair rp=q.poll();        
            // 2.Ignore
            if(visited.containsKey(rp.v)){
                if(visited.get(rp.v)!=rp.d){
                    return false;
                }
                continue;
            }
            // 3.Add Visited
            visited.put(rp.v,rp.d);
            // 5. Add unVisited nbrs
                for(int nbr:graph[rp.v]){
                    if(!visited.containsKey(nbr)){
                        q.add(new Pair(nbr,rp.d+1));
                    }
                }

       

        }
       }

return true;
    }
}