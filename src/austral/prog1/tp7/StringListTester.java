package austral.prog1.tp7;

import austral.util.Scanner;

public class StringListTester {

    public static void main(String[] args) {
        StringList list = new StringList(5);
        list.add("A");
        list.add("B");
        System.out.println(list.size()); // 2

        list.add("C");
        System.out.println(list.size()); // 3
        System.out.println(list.toString()); // ['A', 'B', 'C']

        int dIndex = list.indexOf("D");
        System.out.println(dIndex); // -1

        int bIndex = list.indexOf("B");
        System.out.println(bIndex); // 1


        list.remove(bIndex);
        System.out.println(list.size()); // 2
        System.out.println(list.toString()); // ['A', 'C']

    }

}
