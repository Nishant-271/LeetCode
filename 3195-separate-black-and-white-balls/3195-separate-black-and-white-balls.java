class Solution {
    public long minimumSteps(String s) {
        long count=0;
        long finalcount=0;
       for(int i=s.length()-1;i>0;i--){
        int j=i;
        if(s.charAt(i)=='0') count++;
         if(s.charAt(i)=='0' ){
          while(j>0 && s.charAt(j-1)=='1'){       
               finalcount+=count;
               j--;
       }}
       i=j;
       }
       return finalcount;
    }
}