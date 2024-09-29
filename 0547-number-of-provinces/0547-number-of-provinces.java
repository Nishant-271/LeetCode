class Solution {
    public int findCircleNum(int[][] mat) {
        // By hashmap using bfs 
     int n=mat.length;
     HashMap<Integer,List<Integer>>map=new HashMap<>();
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==1){
                 if(!map.containsKey(i))
                    map.put(i,new ArrayList<>());
                map.get(i).add(j);
              
                 if(!map.containsKey(j)) map.put(j,new ArrayList<>());
                map.get(j).add(i);
            }
        }
}
  int count=0;
  boolean visited[]=new boolean[n];
  for(int u=0;u<n;u++){
    if(!visited[u]){
        bfs(map,visited,u);
        count++;
    }
  }

return count;
    }
public static void bfs(HashMap<Integer,List<Integer>> map,boolean visited[],int u){
    Queue<Integer> q=new LinkedList<>();
    q.add(u);
    visited[u]=true;
     while(!q.isEmpty()){
     int node=q.remove();
    
    if(map.containsKey(node)){
        for(int v:map.get(node)){
            if(!visited[v])
           bfs(map,visited,v);
        }
    }}
}

}