import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) throws FileNotFoundException {
        //this is how you create a new file
        java.io.File file = new java.io.File("File.txt");
        //theres a lot you can find out about a file, check page 479 for more info

        //how to write things to a file
        PrintWriter output = new PrintWriter(file);

        //this is how you write to a file, you can use print, printf, println. they work the same way you would print
        // something to the console but instead its printed to a file
        output.print("hello");
        output.println("234");

        //after everything always close it
        output.close();

        //This is how you read things from a text file to the console
        java.io.File file2 = new java.io.File("newFile.txt");
        Scanner input = new Scanner(file2);
        while (input.hasNext()) {
            input.next();//returns next string
            System.out.println(input.nextLine()); //returns a whole line of things

        }
        //to get the next int double instead put input.nextInt() or input.nextDouble();




        //how to get text from the web!!!
//        try {
//            URL url = new URL("http://www.google.com/index.html");
//            int count = 0;
//            Scanner input1 = new Scanner(url.openStream());
//            while (input1.hasNext()) {
//                String line = input.nextLine();
//                System.out.println(line);
//                count += line.length();
//            }
//
//        } catch (MalformedURLException ex) {
//            System.out.println("You provided a bad url");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
