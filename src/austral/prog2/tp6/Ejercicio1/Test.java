package austral.prog2.tp6.Ejercicio1;

import java.util.Arrays;
import java.util.Iterator;

public class Test {


    public static void main(String[] args) {

     /* ArrayList<Integer> list = new ArrayList<Integer>();

        Integer x = 10;

        for (int i = 0; i < 10; i++) {
            list.add(i, x);
            x--;
        }

       for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("***************");

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("***************");

        CompareInt com = new CompareInt();

        System.out.println(list.isSorted(com));

        list.sort(com);

        System.out.println(list.isSorted(com));

        Iterator<Integer> it2 = list.iterator();

        while(it2.hasNext()){
            System.out.println(it2.next());
        }*/



        LinkedList<Integer> list2 = new LinkedList<Integer>();

        Integer x = 10;

        for (int i = 0; i < 10; i++) {
            list2.add(i, x);
            x--;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("***************");

        Iterator<Integer> it3 = list2.iterator();

        while(it3.hasNext()){
            System.out.println(it3.next());
            }

        System.out.println("***************");

        CompareInt com = new CompareInt();

        System.out.println(list2.isSorted(com));
        list2.sort(com);
        System.out.println(list2.isSorted(com));

        Iterator<Integer> it4 = list2.iterator();
        

        while(it4.hasNext()){
            System.out.println(it4.next());
        }

    }

}

