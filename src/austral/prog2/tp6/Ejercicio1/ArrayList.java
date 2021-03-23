package austral.prog2.tp6.Ejercicio1;

import java.util.Iterator;

public class ArrayList<T extends Comparable<T>> implements List<T>, Comparable<ArrayList<String>> {
        private T[] array;
        private int size;

        public ArrayList(){
            this.array = (T[]) (new Comparable[10]);
            this.size = 0;
        }

        public ArrayList(int size) {
            this.array = (T[]) (new Comparable[size]);
            this.size = 0;
        }

        public T get(int position){
            return array[position];
        }

        public T remove(int position){
            T elem = array[position];

            array[position] = null;

            for (int i = position; i < size - 1; i++) {
                array[i] = array[i+1];
            }
            array[size-1] = null;
            size --;

            return elem;
        }

        public void add(T elem){
            add(size, elem);
        }

        public void add(int position, T elem){
            if (size == array.length){
                T[] newArray = (T[]) (new Comparable[size*2]);
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }

            if (position < size){
                for (int i = size; i > position; i--) {
                    array[i] = array[i-1];
                }
                array[position] = elem;
            }else {
                array[size] = elem;
            }
            size++;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public Iterator<T> iterator() {
            Iterator<T> iterator = new Iterator<T>() {

                int position = -1;

                @Override
                public boolean hasNext() {

                    if( position == array.length - 1  || array[position + 1] == null){
                        return false;
                    }

                    return true;
                }

                @Override
                public T next() {

                    position++;
                    return array[position];

                }
            };
            return iterator;
        }

        public void sort(){
            int n = array.length;
            T temp;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(array[j-1].compareTo(array[j]) > 0){
                        //swap elements
                        temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }

                }
            }
        }

    public void sort(Comparator comparator){
        int n = array.length;
        T temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(comparator.compareTo(array[j-1], array[j])){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public boolean isSorted(){
        for (int i = 0; i < size - 1; i++){
            if(array[i].compareTo(array[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(Comparator comparator){
        for (int i = 1; i < size - 1; i++){
            if(comparator.compareTo(array[i], array[i+1])){
                return false;
            }
        }
        return true;
    }


    @Override
    public int compareTo(ArrayList<String> o) {
        return 0;
    }
}


