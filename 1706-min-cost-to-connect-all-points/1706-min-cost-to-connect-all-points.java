class Solution {
class Pair{
    int node;
    int wt;
    Pair(int n,int wt){
        this.node=n;
        this.wt=wt;
    }
   }

   public int minCostConnectPoints(int[][] points) {
  int n=points.length;
   List<List<Pair>> adj=new ArrayList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
}
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        int x1=points[i][0];
        int y1=points[i][1];
 
        int x2=points[j][0];
        int y2=points[j][1];

        int cost=Math.abs(x2-x1) +Math.abs(y2-y1);
     adj.get(i).add(new Pair(j,cost));
     adj.get(j).add(new Pair(i,cost));
  }
}


  return Prims(adj);


    }

public int Prims(List<List<Pair>> adj){
 PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
 pq.offer(new Pair(0,0));
 boolean isMST[]=new boolean[adj.size()];
 int sum=0;
 while(!pq.isEmpty()){
    Pair p=pq.remove();
    int nn=p.node;
    int ww=p.wt;
  if(isMST[nn]) continue;
  isMST[nn]=true;
  sum+=ww;

for(Pair nbr:adj.get(nn)){
    int nbr_node=nbr.node;
    int nbr_wt=nbr.wt;
 if(isMST[nbr_node]==false){
    pq.offer(new Pair(nbr.node,nbr.wt));
 }

}
 }
return sum;
}


}