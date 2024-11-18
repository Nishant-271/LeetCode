class Solution {
    public int[] decrypt(int[] arr, int k) {
         int ans[]=new int[arr.length];
         if(k>0){
            function(arr,k,ans);
             return ans;
         }
         else if(k==0){
            Arrays.fill(arr,0);
            return arr;
         }
         else{
            reverse(arr);
            function(arr,-1*k,ans);
            reverse(ans);
         }
return ans;
    }
  public static void function(int arr[],int k,int ans[]){
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i+1;j<=k+i;j++){
            sum+=arr[j%arr.length];
        }
     ans[i]=sum;
    }
  }

  public static void reverse(int arr[]){
    int start=0;int end=arr.length-1;
    while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
  }

}