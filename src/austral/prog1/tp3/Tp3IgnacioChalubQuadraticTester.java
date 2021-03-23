package austral.prog1.tp3;

import austral.util.Scanner;

public class Tp3IgnacioChalubQuadraticTester {


    public static void main(String[] args){

        double a = Scanner.getDouble("Ingrese constante A: ");

        double b = Scanner.getDouble("Ingrese constante B:");

        double c = Scanner.getDouble("Ingrese constante C: ");

        Tp3IgnacioChalubQuadratic cuadratica = new Tp3IgnacioChalubQuadratic(a, b, c);

        System.out.println(cuadratica.roots());

        double x = Scanner.getDouble("Ingrese el valor de x: ");

        System.out.println("Su valor de Y para ese x es: " + cuadratica.valueY(x));

        System.out.println("Su funcion es: " + cuadratica.getString());

        System.out.println("Su funcion derivada es: " + cuadratica.derivation());








    }

}
