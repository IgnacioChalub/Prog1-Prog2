package austral.prog2.tp5.Ejercicio2;

public class LinealFunction extends Polinomio{


    public LinealFunction(double a, double b) {
        super(1);
        setCoeficiente(0, b);
        setCoeficiente(1, a);
    }







    public static void main(String[] args) {
        LinealFunction lf = new LinealFunction(2, 1);
        CuadraticFunction cf = new CuadraticFunction(3,2, 1);
        Polinomio p = new Polinomio(3);

        System.out.println(lf.evaluate(3));
        System.out.println(cf.evaluate(3));

       lf.derivar();
       cf.derivar();
    }
}
