class Solution {
    public boolean isBalanced(String s ) {
        // BRUTE FORCE ::
     int odsum=0,evsum=0;
      for(int i=0;i<s.length();i++){
        int num=Character.getNumericValue(s.charAt(i));
         if(i%2==0){
         evsum+=num;  }
      else{
         odsum+=num;
        }    
    }
    System.out.println(evsum + " " + odsum);
        return evsum==odsum;
    }
}