package austral.prog2.tp6.Ejercicio1;

import java.lang.reflect.Method;
import java.util.Iterator;

public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public T get(int position){
        Node<T> nodeInPosition = getNodeInPosition(position);

        return nodeInPosition.getValue();
    }

    public T remove(int position) {
        if (position == 0){
            T elem = head.getValue();
            head = head.getNext();
            return elem;
        }

        T elem = getNodeInPosition(position).getValue();
        Node<T> prev = getNodeInPosition(position-1);
        Node<T> next = getNodeInPosition(position+1);

        prev.setNext(next);
        return elem;
    }

    private Node<T> getNodeInPosition(int position){
        Node<T> current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }

        return current;
    }

    public void add(T elem){
        add(size(), elem);
    }

    public void add(int position, T elem){
        Node<T> newNode = new Node<>(elem);

        if (position == 0){
            newNode.setNext(head);
            head = newNode;
        }else {
            Node<T> prev = getNodeInPosition(position - 1);
            Node<T> next = getNodeInPosition(position);
            prev.setNext(newNode);
            newNode.setNext(next);
        }
    }

    public int size(){
        Node<T> current = head;
        int size = 0;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {

            int position = -1;

            @Override
            public boolean hasNext() {
                if(getNodeInPosition(position).getNext() == null){
                    return false;
                }
                return true;
            }

            @Override
            public T next() {
                position++;
                T t = getNodeInPosition(position).getValue();
                return t;
            }
        };
        return iterator;
    }

    public void sort() {
        for (int j = 0; j < size(); j++) {
            for (int i = 1; i < size(); i++) {

                if (getNodeInPosition(i - 1).getValue().compareTo(getNodeInPosition(i).getValue()) > 0) {

                    Node<T> first = getNodeInPosition(i - 1);
                    Node<T> sec = getNodeInPosition(i);

                    Node<T> posteriorSec = getNodeInPosition(i + 1);

                    if (i > 1){
                        Node<T> anteriorFirst = getNodeInPosition(i - 2);
                        anteriorFirst.setNext(sec);
                    }else{
                        head = sec;
                    }

                    sec.setNext(first);

                    first.setNext(posteriorSec);


                }
            }

        }
    }



    public void sort(Comparator comparator) {
        for (int j = 0; j < size(); j++) {
            for (int i = 1; i < size(); i++) {
                if (comparator.compareTo(getNodeInPosition(i-1).getValue(), getNodeInPosition(i).getValue())) {

                    Node<T> first = getNodeInPosition(i - 1);
                    Node<T> sec = getNodeInPosition(i);

                    Node<T> posteriorSec = getNodeInPosition(i + 1);

                    if (i > 1){
                        Node<T> anteriorFirst = getNodeInPosition(i - 2);
                        anteriorFirst.setNext(sec);
                    }else{
                        head = sec;
                    }

                    sec.setNext(first);

                    first.setNext(posteriorSec);


                }
            }

        }
    }

    public boolean isSorted(){

        for (int i = 0; i < size() - 1; i++) {
            if(getNodeInPosition(i).getValue().compareTo(getNodeInPosition(i+1).getValue()) > 0){
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(Comparator comparator){
        for (int i = 0; i < size() - 1; i++) {
            if(comparator.compareTo(getNodeInPosition(i).getValue(), getNodeInPosition(i+1).getValue())){
                return false;
            }
        }
        return true;
    }
}



