public class LinkedList3<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    LinkedList3(){
        this.size = 0;
    }

    public void insert(E value){
        head = new Node<>(value, head);
        this.size++;
        if (tail == null){
            tail = head;
        }
    }

    public void print(){
        Node<E> current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int getSize(){
        return this.size;
    }


    class Node<E>{
        Node<E> next;
        E value;
        Node(){};
        Node(E value, Node<E> next){
            this.value = value;
            this.next = next;
        }
    }
}
