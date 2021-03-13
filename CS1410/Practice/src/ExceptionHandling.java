import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter an Integer: ");
            input.nextInt();

            //there is always an ex after you type the exception
        } catch (InputMismatchException ex) {
            System.out.println("You did not enter an integer.");
        }
        //Finally clause gets executed whether or not the try works or doesnt work. it will always get run
        finally {
            System.out.println("I get executed no matter what");
        }

    }

    //for most exceptions you have to declare them in the method, dont have to for try and catch blocks
    //if you need to add more exceptions than just separate by a comma.
    public void myMethod() throws IOException, Exception {
        if (5 != 4) {
            throw new Exception("Wow this really works!");
        }
    }
}

//types of exceptions:
//0. Exception - I believe that this one catches them all
//1. ClassNotFoundException - if you try to use a class that does not exist
//2. IOException - related to the input and output operations
//3. RuntimeException
    //3.1 ArithmeticException - dividing integer by zero
    //3.2 NullPointerException - attempt to access an object through a null reference variable
    //3.3 indexOutOfBoundsException - index to an array is out of range
    //3.4 IllegalArgumentException - a method is passed an argument that is illegal or inappropriate
//for more see page 460 in Java Data Structures
//you can make your own exception class. if you ever need it refer to page 474