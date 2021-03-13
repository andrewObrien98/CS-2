public class JulianDate extends Date{
    JulianDate(){
        super(1,1,1);
        long timeZone = System.currentTimeMillis();
        long ourZone = java.util.TimeZone.getDefault().getRawOffset();
        int days = (int) ((timeZone + ourZone)/86400000);
        days = days + 719164;
        addDays(days);

    }
    JulianDate(int year, int month, int day){
        super(year, month, day);
}

    @Override
    public boolean isLeapYear(int year) {
        if (year % 4 == 0){
            return true;
        };
        return false;
    }


}
