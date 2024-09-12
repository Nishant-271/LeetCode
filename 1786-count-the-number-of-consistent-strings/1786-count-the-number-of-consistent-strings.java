class Solution {
    public int check(String a,String b)
    {
        int c=0;
        for(int i=0; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if(b.indexOf(ch)==-1)
            {
                c++;
            }
        }
        if(c==0)
        {
            return 1;
        }
        return 0;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            count+=check(words[i],allowed);
        }
        return count;
        
    }
}