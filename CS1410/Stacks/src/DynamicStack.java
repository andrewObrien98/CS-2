public class DynamicStack<E extends Comparable<E>> {
    private class StackNode<E extends Comparable<E>> {
        public E value;
        public StackNode<E> next;

        public StackNode(E v) {
            this.value = v;
        }

    }

    private StackNode<E> top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(E v) {
        StackNode<E> node = new StackNode<E>(v);
        node.next = top;
        top = node;
    }

    public E pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }

        StackNode<E> oldTop = top;
        top = top.next;
        return oldTop.value;
    }
}
