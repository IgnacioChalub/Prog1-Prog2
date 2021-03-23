package austral.prog2.tp3.Ejercicio3;

public class Triangle extends Figure{

    //suponemos que el triangulo es isoceles

    double base;
    double altura;

    public Triangle(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return base*altura / 2;
    }

    @Override
    public double perimetro() {
        return (Math.sqrt(base*base + altura*altura)) * 2;
    }

    public double base(){
        return base;
    }

    public double altura(){
        return altura;
    }

}
