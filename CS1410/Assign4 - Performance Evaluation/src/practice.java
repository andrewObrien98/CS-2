public class practice {
    public static void main(String[] args) {
        System.out.println((System.currentTimeMillis() - java.util.TimeZone.getDefault().getRawOffset())/86400000);
        System.out.println(java.util.TimeZone.getDefault().getRawOffset()/3600000);


    }
}
