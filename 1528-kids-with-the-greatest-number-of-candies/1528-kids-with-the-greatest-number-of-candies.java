class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
         List<Boolean> ans=new ArrayList<>();
    int max=arr[0];
    for(int i:arr){
        if(i>max) max=i;
    }
    for(int i=0;i<arr.length;i++){
        int val=extra+arr[i];
        if(val>=max){
            ans.add(true);
        }else{
            ans.add(false);
        }     
         
    }  

return ans;

   }
}