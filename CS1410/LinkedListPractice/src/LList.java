
import java.util.ArrayList;
public class LList {
    public static void main(String[] args) {
        urlLinkedLise url = new urlLinkedLise();
        url.insert("hello");
        url.insert("hello1");
        url.insert("hello2");

        System.out.println(url.back());
        System.out.println(url.back());
        System.out.println(url.forward());
        url.insert("andrew");
        System.out.println(url.back());
        System.out.println(url.forward());
        System.out.println(url.forward());


    }
//        LinkedList2<String> numbers = new LinkedList2<>();
//        ArrayList<String> list1 = new ArrayList<String>();
//        list1.add("hello");
//        list1.add("goodbye");
//        list1.add("good afternoon");
//
//        numbers.insert2(list1);
//
//        for(int i = 0; i < numbers.getSize(); i++){
//            ArrayList<String> wordList = numbers.pop();
//            System.out.println(wordList.get(wordList.size() - 1));
//        }
//
//
//
//
//
//
//
////        System.out.println(names.getSize());
////        for(int i = 0; i < numbers.getSize(); i++){
////            System.out.println(names.pop());
////        }
//
//    }
//}
//
//class combineLinkedList<E extends Comparable<E>>{
//    Node<E> head = new Node<E>();
//    int size;
//
//    combineLinkedList(LinkedList2 list1, LinkedList2 list2){
//        this.size = 0;
//        push(list1);
//        push(list2);
//
//
//    }
//
//    void insert(E object){
//        Node<E> node = new Node<>(object);
//        Node<E> current = head.next;
//        Node<E> previous = head;
//
//        while(current != null && current.value.compareTo(object) < 0) {
//            previous = current;
//            current = current.next;
//        }
//        previous.next = node;
//        node.next = current;
//        this.size++;
//    }
//    void push(LinkedList2 list){
//        for (int i = 0; i < list.getSize(); i++){
//            insert((E) list.pop());
//        }
//    }
//
//    public void print(){
//        Node<E> current = head;
//        while(current.next != null){
//            System.out.println(current.next.value);
//            current.next = current.next.next;
//        }
//    }
//
//
//    class Node<E> {
//        Node<E> next;
//        E value;
//        Node(){}
//        Node(E value){
//            this.value = value;
//        }
//
//    }
}