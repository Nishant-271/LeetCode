class Solution {
    public int[] getSneakyNumbers(int[] a) {
        int[] c=new int[101];
        for(int i : a){
            c[i]++;
        }
        int[] ans=new int[2];
        int idx=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==2){
                ans[idx++]=i;
            }
        }
        return ans;
    }
}