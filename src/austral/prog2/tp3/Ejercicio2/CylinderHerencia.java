package austral.prog2.tp3.Ejercicio2;

public class CylinderHerencia extends Circle{

    double altura;

    public CylinderHerencia(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double volume(){
        return area()*altura;
    }

    public static void main(String[] args) {
        CylinderHerencia c = new CylinderHerencia(2, 3);
        System.out.println(c.volume());
    }
}
