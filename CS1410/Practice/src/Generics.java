import java.util.ArrayList;
public class Generics {
    public static void main(String[] args) {
        //generics only work on reference types, like Integer, String, Double

        GenericStack<Integer> numbers = new GenericStack<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(10);
        for (int i = 0; i < 4; i++){
            System.out.println(numbers.get(i));
        }
        compare(numbers.get(1), numbers.get(0));

        System.out.println();
        GenericStack<String> words = new GenericStack<>();
        words.add("Andrew");
        words.add("McCall");
        words.add("Aggie");
        for (int i = 0; i < 3; i++){
            System.out.println(words.get(i));
        }
        compare(words.get(1), words.get(1));
    }

    //when using generics just for a method you define it after static
    //the extends Comparable means that it extends that class
    public static <E extends Comparable<E>> void  compare(E one, E two){
        if(one.compareTo(two) == 1){
            System.out.printf("%s is greater than %s \n", one, two);
        } else if (one.compareTo(two) == 0){
            System.out.printf("%s is equal to %s \n", one, two);
        } else {
            System.out.printf("%s is less than %s \n", one, two);
        }
    }
}


// when using Generics in a class you define it at the end of the classes name
class GenericStack<E>{
    ArrayList<E> list1;
    int size = 0;

    GenericStack() {
        this.list1 = new ArrayList<>();
    }
    void add(E object){
        this.list1.add(object);
        size++;
    }

    E get(int number) {
        return this.list1.get(number);
    }

    int length(){
        return this.size;
    }

}
