// class Solution {
//     public String clearDigits(String s) {
//          if(s.length()==1 && Character.isDigit(s.charAt(0)))  return "";
//          char arr[]=s.toCharArray();
//         String k="";
//          for(int i=0;i<=s.length()+1;i++){
//             if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(i+1))){
//                 k+=s.charAt(i);
//             }
//          }
// return k;

//     }
// }

class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else
                sb.append(c);
        }
        return sb.toString();
    }
}
