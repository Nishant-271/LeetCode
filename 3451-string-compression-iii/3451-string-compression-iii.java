class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;  // As already Exists 1 counter for pehla
        
        for (int i = 0; i < word.length(); i++) {
            
            if (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                counter++;
                if (counter == 9)   // 9 pe counter reset hoga
                {
                    sb.append(counter);
                    sb.append(word.charAt(i));
                    counter = 0;
                    i++;  // next character after reaching 9 count
                    counter = 1;  // Restart counting from the new character
                }
            }
                else {
                sb.append(counter == 0 ? 9 : counter); 
                sb.append(word.charAt(i));
                counter = 1; 
            }
        }
        
        return sb.toString();
    }
}