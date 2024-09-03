class Solution {
    public int getLucky(String s, int k) {
         String str="";
         for(char ch:s.toCharArray()){
            str+=((int)ch-96);
         }
         int sum=0;
         for(int j=1;j<=k;j++){
            sum=0;
            for(int i=0;i<str.length();i++){
                sum+=(int)(str.charAt(i))-48;
            }
            str=Integer.toString(sum);
         }

return sum;
    }
}