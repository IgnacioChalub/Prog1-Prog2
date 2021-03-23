package austral.prog1.tp2;

import austral.util.Scanner;

public class Tp2IgnacioChalubGenerateKey {
    public static void main(String[] args) {

            String apellido = Scanner.getString("Apellido: ");
            String nombre = Scanner.getString("Nombre: ");

            char primeraLetra = apellido.charAt(0);
            char m = 'M';

            if( ((int)primeraLetra) < ((int)m) ){
                System.out.println("Su apellido comienza con una letra ANTERIOR a la M.");
            }else if( ((int)primeraLetra) == ((int)m) ){
                System.out.println("Su apellido comienza con letra M.");
            }else{
                System.out.println("Su apellido comienza con una letra POSTERIOR a la M.");
            }

            String psw = nombre.substring( nombre.length() - 3, nombre.length());
            System.out.println("Su contrasena es: " + (apellido.substring(0, 3)) + psw );
    }

}
