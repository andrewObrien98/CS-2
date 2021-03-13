//Andrew Peterson CS1410 assn 1
import java.util.Scanner;

public class Quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double numA = input.nextDouble();
        double numB = input.nextDouble();
        double numC = input.nextDouble();

        //Find if it is positive, zero, or negative
        double discriminant = Math.pow(numB, 2.0) - (4*(numA*numC));
        double r1 = (-numB + Math.sqrt(discriminant))/ 2 * numA;
        double r2 = (-numB - Math.sqrt(discriminant))/ 2 * numA;


        //This is where I find the r1 and r2
        if (discriminant > 0) {
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        }
        else if (discriminant == 0) {
            System.out.println("r1 = " + r1);
        }
        else {
            System.out.println("There are no roots for the quadratic equation with these coefficients.");
        }
    }
}