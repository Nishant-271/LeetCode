class Solution {
    public int[] minOperations(String boxes) {
        char arr[]=boxes.toCharArray();

        int ans[]=new int[arr.length];
     for(int i=0;i<arr.length;i++){
        int count=0;
        for(int j =0;j<ans.length;j++){
            if(arr[j]=='1'){
                count+=Math.abs(i-j);
            }
        }
        ans[i]=count;
     }
 

return ans;
    }
}