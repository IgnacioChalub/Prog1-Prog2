package austral.prog1.tp4;

import austral.util.Scanner;

public class Tp4IgnacioChalubStringArrayUtilTester {
    public static void main(String[] args){


        String[] myArray = Tp4IgnacioChalubStringArrayUtil.fillArray("Ingrese un string: ", 5);

        String borrar = Scanner.getString("Ingrese un string que desea borrar: ");

        if(Tp4IgnacioChalubStringArrayUtil.indexOf(myArray, borrar) == -1){
            System.out.println("No existe ese string en el arreglo.");
        }else{
            System.out.println("Su string a sido eliminado correctamente");
        }

        Tp4IgnacioChalubStringArrayUtil.remove(myArray, borrar);

        String poner = Scanner.getString("Ingrese un string que desea poner: ");

        if(Tp4IgnacioChalubStringArrayUtil.put(myArray, poner) == -1){
            System.out.println("No hay lugar libre para es string.");
        }else{
            System.out.println("Su string a sido ubicado correctamente");
        }

        int ver = Scanner.getInt("Ingrese 1 para ver su arreglo: ");

        if(ver == 1){
            Tp4IgnacioChalubStringArrayUtil.print(myArray);
        }else{
            System.out.println("Puede cerrar el programa");
        }

    }


}
