// import java.time.LocalDate;

// class Solution {
//     public String dayOfTheWeek(int day, int month, int year) {
//         String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//         LocalDate date = LocalDate.of(year, month, day);
//         return dayNames[date.getDayOfWeek().getValue() - 1];
//     }
// }

import java.time.LocalDate;

class Solution{
    public String dayOfTheWeek(int day,int month,int year){
        String[] dayindex={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        LocalDate date=LocalDate.of(year,month,day);
        return dayindex[date.getDayOfWeek().getValue()-1];
    }
}
