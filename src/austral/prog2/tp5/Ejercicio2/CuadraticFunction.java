package austral.prog2.tp5.Ejercicio2;

public class CuadraticFunction extends Polinomio{


    public CuadraticFunction(double a, double b, double c) {
        super(2);
        setCoeficiente(0, c);
        setCoeficiente(1, b);
        setCoeficiente(2,a);
    }

}
