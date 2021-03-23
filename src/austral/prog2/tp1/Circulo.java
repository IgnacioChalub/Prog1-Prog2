package austral.prog2.tp1;

import java.awt.*;

public class Circulo {

    Point2D centro;
    double radio;

    public Circulo(double x, double y, double radio){
        centro = new Point2D(x,y);
        this.radio = radio;
    }

    public Point2D center(){
        return centro;
    }

    public double area(){
        return radio*radio*3.14;
    }
    public double perimeter(){
        return 2*3.14*radio;
    }

    public boolean contains(Point2D point){
        if(point.getDistance(center()) <= radio){
            //System.out.println(point.getDistance(center()));
            //System.out.println(radio);
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(0,0, 1);
        System.out.println(circulo.area());
        Point2D punto = new Point2D(1,1);
        //System.out.println(punto.getDistance(circulo.center()));
        System.out.println(circulo.contains(punto));
    }

}
