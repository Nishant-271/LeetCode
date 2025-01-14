class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
      int ans[]=new int[A.length];
      int j=0;
      for(int i=0;i<A.length;i++){
        l1.add(A[i]);
        l2.add(B[i]);
        if(A[i]==B[i]){
            j++;
        }
       else{
         if(l1.contains(B[i])){
            j++;
        }
        if(l2.contains(A[i])){
            j++;
        }
      
       }
        ans[i]=j;
        j=ans[i];
      }
      return ans;
    }
}