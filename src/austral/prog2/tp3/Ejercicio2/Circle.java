package austral.prog2.tp3.Ejercicio2;

public class Circle extends Figura{

    double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }

    public double perimeter(){
        return Math.PI * radio *2;
    }


}
