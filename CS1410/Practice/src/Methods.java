import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = number.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        distinctNumbers(numbers);
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static void distinctNumbers(int[] numbers){
        for (int i = 0; i < 10; i++) {

        }
    }

}
