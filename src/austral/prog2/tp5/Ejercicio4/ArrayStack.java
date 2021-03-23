package austral.prog2.tp5.Ejercicio4;

public class ArrayStack<T> implements Stack<T> {
    private T array[];
    private int top;

    public ArrayStack(int size) {
        array = (T[]) new Object[size];
        top = -1;
    }


    @Override
    public void push(T element) {
        array[++top] = element;

    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        } else return array[top];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
