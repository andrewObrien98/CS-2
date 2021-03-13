public class GregorianDate {
    private int year;
    private int day;
    private int month;

    GregorianDate(){
        this.year = 1970;
        this.day = 1;
        this.month = 1;
        long timeZone = System.currentTimeMillis();
        long ourZone = java.util.TimeZone.getDefault().getRawOffset();
        int days = (int) ((timeZone + ourZone)/86400000);
        addDays(days);

    }
    GregorianDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    void addDays(int days){
//        this.day = this.day + days;
//        boolean run = true;
//        while(run){
//            if (this.day > getNumberOfDaysInYear(this.year)){
//                this.day = this.day - getNumberOfDaysInYear(this.year);
//                this.year++;
//            }
//            else{
//                run = false;
//            }
//        }
//        boolean run2 = true;
//        while(run2){
//            if (this.day <= getNumberOfDaysInMonth(this.year, this.month)){
//                run2 = false;
//            }
//            else{
//                this.day = this.day - getNumberOfDaysInMonth(this.year, this.month);
//                this.month++;
//                if (this.month > 12){
//                    this.month = 1;
//                    this.year += 1;
//                }
//            }
//        }
        for (int i = 0; i < days; i++){
            this.day++;
            if(this.day > getNumberOfDaysInMonth(this.year, this.month)){
                if(this.month == 12){
                    this.month = 1;
                    this.year++;
                }
                else{this.month++;}
                this.day = 1;
            }
        }
    }
     void subtractDays(int days){
//        while(days > getNumberOfDaysInYear(this.year)){
//            days = days - getNumberOfDaysInYear(this.year);
//            this.year--;
//        }
        for(int i = 0; i < days; i++){
            if (this.day - 1 <= 0){
                if(this.month == 1){
                    this.month = 12;
                    this.year--;
                }
                else{
                    this.month = this.month - 1;
                }
                this.day = getNumberOfDaysInMonth(this.year, this.month);
            }
            else{this.day--;}
        }
     }
     boolean isLeapYear(){
         if (this.year % 4 != 0){
             return false;
         }
         else if (this.year % 100 != 0){
             return true;
         }
         else if (this.year % 16 != 0){
             return false;
         }
         else {
             return true;
         }
     }
     void printShortDate(){
         System.out.printf("%d/%d/%d", getMonth(), getDayOfMonth()
                 , getYear());
     }
     void printLongDate(){

        System.out.printf("%s %d, %d", getMonthName(), getDayOfMonth(), getYear());
     }
     String getMonthName(){
        return getMonthName(this.month);
     }
     int getMonth(){
        return this.month;
     }
     int getYear(){
        return this.year;
     }
     int getDayOfMonth(){
        return this.day;
     }
     private boolean isLeapYear(int year){
        if (year % 4 != 0){
            return false;
        }
        else if (year % 100 != 0){
            return true;
        }
        else if (year % 16 != 0){
            return false;
        }
        else {
            return true;
        }
     }
     private int getNumberOfDaysInMonth(int year, int month){
        if(month == 12){ return 31;}
        else if (month == 11){return 30;}
        else if (month == 10){return 31;}
        else if (month == 9){return 30;}
        else if (month == 8){return 31;}
        else if (month == 7){return 31;}
        else if (month == 6){return 30;}
        else if (month == 5){return 31;}
        else if (month == 4){return 30;}
        else if (month == 3){return 31;}
        else if (month == 2){
            if(isLeapYear()){ return 29; }
            else {return 28;}
        }
        else{return 31;}
     }
     private int getNumberOfDaysInYear(int year){
        if (isLeapYear(year)){
            return 366;
        }
        return 365;
     }
     private String getMonthName(int month){
        if (month == 1){return "January";}
        else if (month == 2){return "February";}
        else if (month == 3){return "March";}
        else if (month == 4){return "April";}
        else if (month == 5){return "May";}
        else if (month == 6){return "June";}
        else if (month == 7){return "July";}
        else if (month == 8){return "August";}
        else if (month == 9){return "September";}
        else if (month == 10){return "October";}
        else if (month == 11){return "November";}
        else{return "December";}
     }
}
