class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int freq[]=new int[nums.length+1];
        List<Integer> ll=new ArrayList<>();
        for(int i:nums){
            freq[i]++;
            if(freq[i]==2){
              ll.add(i);
            }
        }
        return ll;
    }
}