class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
      if(n==0) return true;
      int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            if((i==0 ||arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0)){
                count++;
                if(count==n){
                    return true;
                }
                i++;
            }  
        }
      }
      return false;
    }
}