package austral.prog2.tp3.Ejercicio2;

//empleando composicion

public class Cylinder extends Figura{

    Circle base;
    double altura;

    public Cylinder(Circle base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        double a = (base.perimeter() * altura) + base.area() * 2;
        return a;
    }

    public double volumen(){
       double v = (base.area() * altura);
       return v;
    }

}
