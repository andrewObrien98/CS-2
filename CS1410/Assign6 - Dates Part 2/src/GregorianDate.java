public class GregorianDate extends Date {
    GregorianDate() {
        super(1970, 1, 1);
        long timeZone = System.currentTimeMillis();
        long ourZone = java.util.TimeZone.getDefault().getRawOffset();
        int days = (int) ((timeZone + ourZone) / 86400000);
        addDays(days);
    }

    GregorianDate(int year, int month, int day) {
        super(year, month, day);
    }

    @Override
    public boolean isLeapYear(int year){
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
}