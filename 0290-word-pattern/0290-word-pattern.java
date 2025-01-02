
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if (pattern.length() != arr.length) return false;

        HashMap<String, Character> wtc = new HashMap<>();
        HashMap<Character,String> ctw = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
        String word=arr[i];
        char ch=pattern.charAt(i);
         if(wtc.containsKey(word)){
            if(wtc.get(word)!=ch) return false;
         }else{
            wtc.put(word,ch);
         }
         
         if(ctw.containsKey(ch)){
            if(!ctw.get(ch).equals(word)) return false;
         }else{
            ctw.put(ch,word);
         }
        
        }
        return true;
    }
}
