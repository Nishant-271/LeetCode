class Solution {
    public long dividePlayers(int[] skill) {
        int i=0;
        int j=skill.length-1;

        Arrays.sort(skill);
        int sum=skill[0]+skill[j];
        long res=0;
        while(i<=j){
            int s=skill[i]+skill[j];
            if(s!=sum){
                return -1;
            }
            res=res+(skill[i]*skill[j]);
            i++;
            j--;
        }
        return res;
    }
}