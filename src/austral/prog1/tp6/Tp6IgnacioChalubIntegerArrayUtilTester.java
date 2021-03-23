package austral.prog1.tp6;

import austral.util.Scanner;

public class Tp6IgnacioChalubIntegerArrayUtilTester {
    public static void main(String[] args){

        int cantidad = Scanner.getInt("Ingrese la cantidad de elementos del arreglo: ");

        int[] array = Tp6IgnacioChalubIntegerArrayUtil.fillArray("Ingrese un numero: ", cantidad);

        while(true){

            System.out.println(
                    "------------\n"+
                            "Operaciones:\n"+
                            "1. Print\n"+
                            "2. Sum\n"+
                            "3. Avg\n"+
                            "4. Max\n"+
                            "5. Min\n"+
                            "6. Sort\n"+ //NO FUNCIONA
                            "7. Salir\n"
            );

            int accion = Scanner.getInt("Que operacion desea realizar: ");

            System.out.println();

            switch (accion){

                case 1:
                    System.out.println("Su arreglo es: " + Tp6IgnacioChalubIntegerArrayUtil.toString(array));
                    break;
                case 2:
                    System.out.println("Sum: " + Tp6IgnacioChalubIntegerArrayUtil.sum(array));
                    break;
                case 3:
                    System.out.println("Avg: " + Tp6IgnacioChalubIntegerArrayUtil.avg(array));
                    break;
                case 4:
                    System.out.println("Max: " + Tp6IgnacioChalubIntegerArrayUtil.max(array));
                    break;
                case 5:
                    System.out.println("Min: " + Tp6IgnacioChalubIntegerArrayUtil.min(array));
                    break;
                case 6:
                    Tp6IgnacioChalubIntegerArrayUtil.sort(array);
                    System.out.println("Sort: " + Tp6IgnacioChalubIntegerArrayUtil.toString(Tp6IgnacioChalubIntegerArrayUtil.sort(array))); //NO FUNCIONA
                    break;
                case 7:
                    System.out.println("Gracias por usar este programa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es posible realizar esa operacion.");
                    break;
            }

        }





    }
}
