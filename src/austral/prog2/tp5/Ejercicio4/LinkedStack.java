package austral.prog2.tp5.Ejercicio4;

public class LinkedStack<T> implements Stack<T> {

    Node top;

    class Node {
        T value;
        Node next;
    }

    public LinkedStack() {
        top = null;
    }

    @Override
    public void push(T element) {
        Node oldTop = top;
        top = new Node();
        top.value = element;
        top.next = oldTop;

    }

    @Override
    public T pop() {
        T value = top.value;
        top = top.next;
        return value;

    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
