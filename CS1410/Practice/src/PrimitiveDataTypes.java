public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //when writing primitive data types you can enter the value as a string or not
        Double number = new Double("5.0");
        Double number1 = new Double(5.0);

        // this is a way to convert between doubles, int, float, long, short
        Integer number2 = new Double(5.12).intValue();
        //returns 5
        Double number3 = new Integer(5).doubleValue();
        //returns 5.0

        //you can also use the compareTo() method that return -1, 0, and 1 if less than, equal to, greater than

    }
}
