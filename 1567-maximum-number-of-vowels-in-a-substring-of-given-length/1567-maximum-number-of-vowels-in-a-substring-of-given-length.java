class Solution {
    public int maxVowels(String s, int k) {
// BRUTE FORCE ::::

//          int mx=0;
//          for(int i=0;i<=s.length()-k;i++){
//             String j=s.substring(i,i+k);
//            int n=max(j);
         
//           mx=Math.max(mx,n);
//          }
// return mx;

//     }
//     public static int max(String s){
//         s=s.toLowerCase();
//         int count=0;
//         for(char c:s.toCharArray()){
//           if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') count++;
     
//         }
//     return count;

//  OPTIMAL USING SLIDING WINDOW::

int maxvowel=0;
int currentvowel=0;
for(int i=0;i<k;i++){
    if(isVowel(s.charAt(i))) currentvowel++;
}maxvowel=currentvowel;

for(int i=k;i<s.length();i++){
    if(isVowel(s.charAt(i-k))) currentvowel--;
    if(isVowel(s.charAt(i))) currentvowel++;
    maxvowel=Math.max(maxvowel,currentvowel);
}

return maxvowel;
    }
    public static boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}