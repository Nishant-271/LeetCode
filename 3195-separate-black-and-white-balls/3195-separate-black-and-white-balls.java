class Solution {
    public long minimumSteps(String s) {
        long count=0;
        long finalcount=0;
       for(int i=s.length()-1;i>0;i--){
         if(s.charAt(i)=='0' ){
            count++;
          while(i>0 && s.charAt(i-1)=='1'){       
               finalcount+=count;
               i--;
       }}
       }
       return finalcount;
    }
}