class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
    int answer=0;
    for(int j=0;j<n;j++)
    {
     int[] picking = new int[11];
    for(int i=0;i<pick.length;i++)
    {
        int person=pick[i][0];
        int color= pick[i][1];
        if(person==j)
        { 
        picking[color]++;
        }
    } 
     for(int i=0;i<picking.length;i++)
     {
        if(picking[i]>j)
        {
            answer+=1;
            break;
        }
     }
    }
    return answer;
    }
}