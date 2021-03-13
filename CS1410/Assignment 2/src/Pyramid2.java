import java.util.Scanner;
public class Pyramid2{
    public static void main(String[] args) {
        //This part will give us the number to use and the spacing for each number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        long answer = input.nextLong();
        long forSpacing = Math.round(Math.pow(2, answer -1 ));
        String forLength = "" + forSpacing;
        long len = forLength.length() + 1;
        long spacing = len * answer;

        //This below is what will create the pyramid
        for(long i = 0; i < answer; i++){
            //This part is just adding the 1 to each part of the pyramid on the left side
            String format = "%" + spacing + "d";
            System.out.printf(format, 1);
            spacing -= len;

            //For left side of triangle
            for(long k = 1; k <= i; k++ ){
                String format1 = "%" + len + "d";
                System.out.printf(format1, Math.round(Math.pow(2, k)));
            }

            //For right side of triangle
            for(long j = 1; j <= i; j++){
                String format2 = "%" + len + "d";
                System.out.printf(format2,Math.round(Math.pow(2, (i - j))));
            }
            //This starts a new line
            System.out.println();
        }
    }}