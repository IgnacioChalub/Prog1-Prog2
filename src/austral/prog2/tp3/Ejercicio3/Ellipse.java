package austral.prog2.tp3.Ejercicio3;

public class Ellipse extends Figure{

    double radio1;
    double radio2;

    public Ellipse(double radio1, double radio2){
        this.radio1 = radio1;
        this.radio2 = radio2;
    }

    @Override
    public double area() {
        return Math.PI * radio1 * radio2;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*Math.sqrt(((radio1*radio1)+(radio2*radio2))/2); // formula de google
    }
}
