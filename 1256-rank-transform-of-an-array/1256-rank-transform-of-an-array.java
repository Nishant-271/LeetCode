class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [][] dummy= new int[arr.length][2];
        for(int i=0; i<arr.length; i++){
            dummy[i][0]=arr[i];
            dummy[i][1]=i;
        }

        Arrays.sort(dummy, (a,b)->a[0]-b[0]);

        int [] ans= new int[arr.length];
        int rank=1;
        for(int i=0; i<dummy.length; i++){
            if(i>0 && dummy[i][0] != dummy[i-1][0])
                rank++;
            ans[dummy[i][1]]=rank;
        }

        return ans;
        
    }
}