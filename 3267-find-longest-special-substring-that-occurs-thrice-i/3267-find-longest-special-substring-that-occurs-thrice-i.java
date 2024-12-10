class Solution {
    public int maximumLength(String s) {
        int maxCount = 0;
        String storeStr = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String str = s.substring(i, j+1);
                int count = 1;
                for(int k = i+1; k < s.length(); k++){ 
                    if(k + str.length() <= s.length()){
                        String newStr = s.substring(k, k+str.length());
                        if(checkSame(str, newStr)){
                            count++;
                        }
                    }
                }
                if(count > 2 && str.length() > storeStr.length()){
                        maxCount = count;
                        storeStr = str;
                }
            }
        }
        if(maxCount >= 3){
            return storeStr.length();
        }
        return -1;
    }
    public boolean checkSame(String s1, String s2){
        char ch = s1.charAt(0);
        for(int i = 0; i < s1.length(); i++){
            if(ch != s1.charAt(i) || ch != s2.charAt(i)) return false;
        }
        return true;
    }
}