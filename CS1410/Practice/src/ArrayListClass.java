import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Andrew");
        names.add("McCall");
        names.add("Kim");

        //this inserts names at a specific index
        names.add(1, "jonny");

        //see's if it contains something and return true or false
        names.contains("Andrew");

        //get a value at specific point
        names.get(1);

        //returns the index of the object
        names.indexOf("Kim");

        //checks to see if its empty and return boolean
        names.isEmpty();

        //gives you index of the last matching element
        names.lastIndexOf("Andrew");

        //gives you the size
        names.size();

        //removes element at specified index
        names.remove(0);

        //sets the elements at the specified index
        names.set(3, "Andrew");

        //clears the arrayList
        names.clear();
    }
}
