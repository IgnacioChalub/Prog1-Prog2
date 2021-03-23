package austral.prog2.tp6.Ejercicio1;

public interface List<T extends Comparable<T>> {
    T get(int position);
    T remove(int position);
    void add(T elem);
    void add(int position, T elem);
    int size();
    boolean isEmpty();
}

