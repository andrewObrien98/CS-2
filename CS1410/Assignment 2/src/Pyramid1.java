import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args) {
//This is where we get the numbers and input that we need
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        String answer = input.next();
        int len = answer.length() + 1;
        int number = Integer.parseInt(answer);
        int spacing = number * len;

        //These for loops will create the pyramid
        for(int i = 1; i <= number; i++) {
            //This one gives first left oriented number
            String format = "%" + spacing + "d";
            System.out.printf(format, i);
            spacing -= len;

            //left side of the pyramid excluding first number
            for(int k = 1; k < i; k++){
                String format1 = "%" + len + "d";
                System.out.printf(format1, i-k);
            }

            //Right side of the pyramid
            for(int j = 1; j < i; j++){
                String format2 = "%" + len + "d";
                System.out.printf(format2, j+1);
            }
            //This starts a new line
            System.out.println();
        }
    }
}
