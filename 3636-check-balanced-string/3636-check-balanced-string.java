class Solution {
    public boolean isBalanced(String s ) {
        // BRUTE FORCE ::
     int odsum=0,evsum=0;
      for(int i=0;i<s.length();i++){
         if(i%2==0){
         evsum+=Integer.parseInt(String.valueOf(s.charAt(i)));  }
      else{
         odsum+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }    
    }
    System.out.println(evsum + " " + odsum);
        return evsum==odsum;
    }
}