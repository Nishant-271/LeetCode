class Solution {
    public String convertDateToBinary(String date) {
    String arr[]=date.split("-");

     int y=Integer.parseInt(arr[0]);
     int m=Integer.parseInt(arr[1]);
     int d=Integer.parseInt(arr[2]);
    
    String year=Integer.toBinaryString(y);
    String month=Integer.toBinaryString(m);
    String dat=Integer.toBinaryString(d);
    

    return year+"-"+month+"-"+dat;
    }
}