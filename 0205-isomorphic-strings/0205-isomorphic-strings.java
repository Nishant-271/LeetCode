class Solution {
    public boolean isIsomorphic(String s, String t) {
      if(s.length()!=t.length()) return false;
     
        HashMap<Character,Character> m1=new HashMap<>();
        HashMap<Character,Character> m2=new HashMap<>();
     
    for(int i=0;i<s.length();i++){
        char ss=s.charAt(i);
        char tt=t.charAt(i);
   
      if(m1.containsKey(ss) && m1.get(ss)!=tt ) return false;
      if(m2.containsKey(tt) && m2.get(tt)!=ss ) return false;
   
     m1.put(ss,tt);
     m2.put(tt,ss);
    }
    return true;
    }
}