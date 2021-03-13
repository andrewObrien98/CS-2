//Andrew Peterson CS1410 assn 1
import java.security.cert.X509Certificate;
import java.util.Scanner;

public class ISBN{
    public static void main(String[] args) {
        // Enter the first 9 digits of an ISBN:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        int ISBN = input.nextInt();

        //first hard equation to find d1, d2, d3...
        int d1 = ISBN/100_000_000;
        int n1 = ISBN - (d1 * 100_000_000);
        int d2 = n1 / 10_000_000;
        int n2 = n1 - (d2 * 10_000_000);
        int d3 = n2 / 1_000_000;
        int n3 = n2 - (d3 * 1_000_000);
        int d4 = n3 / 100_000;
        int n4 = n3 - (d4 * 100_000);
        int d5 = n4 / 10_000;
        int n5 = n4 - (d5 * 10_000);
        int d6 = n5 / 1_000;
        int n6 = n5 - (d6 * 1_000);
        int d7 = n6 / 100;
        int n7 = n6 - (d7 * 100);
        int d8 = n7 / 10;
        int d9 = n7 - (d8 * 10);

        // now to use the equation that finds what d10 is
        int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

        //This part is added in case d10 = 10
        if (d10 == 10){
            System.out.print("The ISBN-10 number is: ");
            System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + "X");
        }
        else {
            //What the user will see and where the whole new ISBN-10 number is printed
            System.out.print("The ISBN-10 number is: ");
            System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10);
        }
    }
}