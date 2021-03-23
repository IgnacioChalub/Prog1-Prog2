package austral.prog1.tp2;

import java.util.Scanner;

public class Tp2IgnacioChalubRect {
    public static void main(String[] args) {

        Scanner coeficienteA = new Scanner(System.in);
        System.out.println("Ingrese coeficiente A de su ecuacion de la recta: ");
        Double pendiente = Double.parseDouble(coeficienteA.nextLine());

        Scanner coeficienteB = new Scanner(System.in);
        System.out.println("Ingrese coeficiente B de su ecuacion de la recta: ");
        Double ordenadaAlOrigen = Double.parseDouble(coeficienteB.nextLine());

        Scanner primerX = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x1 del primer punto: ");
        Double x1 = Double.parseDouble(primerX.nextLine());

        Scanner segundoX = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x2 del segundo punto: ");
        Double x2 = Double.parseDouble(segundoX.nextLine());

        System.out.println("Para la siguiente ecuacion: Y = " + pendiente + "x + " + ordenadaAlOrigen);

        double y1 = calculateY(pendiente, ordenadaAlOrigen, x1);
        double y2 = calculateY(pendiente, ordenadaAlOrigen, x2);


        System.out.println("Dados los siguientes puntos:");
        System.out.println("P1 (" + x1 + "," +  y1 + ")");
        System.out.println("P2 (" + x2 + "," +  y2 + ")");

        System.out.println("La distancia entre ellos es: " + distance(x1, y1, x2, y2));

    }

    public static double calculateY(double a, double b, double x) {

        double result = ( (double) a * (double) x) + (double) b;

        return result;

    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d;

    }
}
