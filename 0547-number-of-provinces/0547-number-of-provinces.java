class Solution {
    public int findCircleNum(int[][] edges) {
       int n=edges.length;
    // by without hashmap
   
      /* 
//   by hashmap 
        HashMap<Integer,List<Integer>> map=new HashMap<>();
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            if(edges[i][j]==1)
            
            {if(!map.containsKey(i)){
                map.put(i,new ArrayList<>());
            }
            map.get(i).add(j);

            if(!map.containsKey(j)){
                map.put(j,new ArrayList<>());
            }
            map.get(j).add(i);
           }
        }}
        */
   int count=0;
   boolean visited[]=new boolean[n];
   for(int u=0;u<n;u++){
    if(!visited[u]){
        dfs(edges,visited,u);
        count++;
    }
   }

return count;
    }

    public static void dfs(int[][]edges,boolean visited[],int u){
        visited[u]=true;
       for(int v=0;v<edges.length;v++){
           if(!visited[v] && edges[u][v]==1){
            dfs(edges,visited,v);
           }
       }
    }
}