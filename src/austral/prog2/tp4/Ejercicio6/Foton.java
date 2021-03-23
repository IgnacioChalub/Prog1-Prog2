package austral.prog2.tp4.Ejercicio6;

public class Foton extends Particula{

    static double h = 6.6260664*Math.pow(10,-34);
    static double vLuz = 299792458;

    double lambda;

    public Foton(double lambda){
        this.lambda = lambda;
    }

    @Override
    public double calcularEnergia() {
        return (h*vLuz)/lambda;
    }
}
