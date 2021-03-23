package austral.prog2.tp3.Ejercicio3;

public class Rectangle extends Figure{

    double base;
    double altura;

    public Rectangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*2 + altura*2;
    }

    @Override
    public double perimetro() {
        return base * altura;
    }

    public double diagonal(){
        return Math.sqrt(base*base + altura*altura);
    }

    public double base(){
        return base;
    }

    public double altura(){
        return altura;
    }
}
