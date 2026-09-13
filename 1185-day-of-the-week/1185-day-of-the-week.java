class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};

        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int totaldays=0;
        for(int i=1971;i<year;i++){
            if(isLeap(i)){
                totaldays+=366;            
            }
            else{
                totaldays+=365;
            }
        }
        for(int i=1;i<month;i++){
            totaldays+=months[i-1];

            if(i==2 && isLeap(year)){
                totaldays++;
            }
        }
        totaldays+=day-1;
        return days[totaldays%7];
    }
    public static boolean isLeap(int year){
        if(year%400==0 || (year%4==0 && year%100 !=0)){
            return true;
        }
        else{
            return false;
        }
    }
}