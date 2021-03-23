package austral.prog2.tp4.Ejercicio6;

public class Free extends Particula {

    double masa;
    double velocity;

    public Free(double masa, double velocity){
        this.masa = masa;
        this.velocity = velocity;
    }

    @Override
    public double calcularEnergia() {
        return (masa*velocity*velocity)/2;
    }


}
