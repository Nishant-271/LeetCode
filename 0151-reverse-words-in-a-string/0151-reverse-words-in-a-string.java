class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String []arr=s.split("\\s+");
        System.out.print(Arrays.toString(arr));

String ans="";
for(int i=arr.length-1;i>0;i--){
    ans+=arr[i]+" ";
}
 ans+=arr[0];

return ans;
    }
}