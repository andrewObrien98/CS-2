import java.util.Scanner;

public class FinalExamPractice {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        boolean found = false;

        while (!found){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter any number between 1 - 100: ");
            int guess = input.nextInt();

            if (guess == random) {
                System.out.println("Congratulations you found the random number");
                found = true;
            } else if (guess > random){
                System.out.println("Your guess was to high!");
            } else {
                System.out.println("Your guess was to low");
            }

        }
    }
}