class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vowel=0,conso=0;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1 || "AEIOU".indexOf(ch)!=-1){
                  vowel++;    
                }else{
                    conso++;
                }
            }
        }
        return (vowel!=0 && conso!=0);
    }
}