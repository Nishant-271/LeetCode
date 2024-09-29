class Solution {
    public int findCircleNum(int[][] mat) {
        // By hashmap using bfs 
     int n=mat.length;
  int count=0;
  boolean visited[]=new boolean[n];
  for(int u=0;u<n;u++){
    if(!visited[u]){
        bfs(mat,visited,u);
        count++;
    }
  }

return count;
    }

public static void bfs(int [][]mat,boolean visited[],int u){
    Queue<Integer> q=new LinkedList<>();
    q.add(u);
    visited[u]=true;
     while(!q.isEmpty()){
     int node=q.remove();
  for(int v=0;v<mat.length;v++){
     if(!visited[v] && mat[node][v]==1){
        // bfs(mat,visited,v);
           visited[v] = true; // Mark v as visited
                q.add(v); //
     }
  }
}
}
}