import java.util.Scanner;

public class Threads {
    public static void main(String[] args) {
        int userinput = 0;
        while(userinput != -1){
            System.out.println("Input a number greater than 0");
            Scanner scanner = new Scanner(System.in);
            userinput = scanner.nextInt();
            new Counter(userinput);
        }
    }
}
