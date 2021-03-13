import java.util.Arrays;
import java.util.Random;

public class javaLibrary {
    public static void main(String[] args) {

        //date java library
        System.out.println(System.currentTimeMillis());
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString());

        //random library
        System.out.println();
        Random generator1 = new Random();
        System.out.print("From generator1: ");
        for (int i = 0; i < 10; i++){
            System.out.print(generator1.nextInt(1000) + " ");
        }

        System.out.println();
        Random generator2 = new Random();
        System.out.print("From generator2: ");
        for (int i = 0; i < 10; i++){
            System.out.print(generator2.nextInt(1000) + " ");
        }


    }
}
