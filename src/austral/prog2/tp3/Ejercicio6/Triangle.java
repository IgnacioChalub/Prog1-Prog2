package austral.prog2.tp3.Ejercicio6;

import austral.prog2.tp1.Point2D;

import java.awt.*;

public class Triangle extends Poligono{

    public Triangle(Point2D[] vertices) {
        super(vertices);
    }

    @Override
    public double area(){ //formula de google
        double s = perimetro()/2;
        double a = (double) Math.sqrt(s* (s-vertices[0].getDistance(vertices[1])) * (s-vertices[1].getDistance(vertices[2])) * (s-vertices[2].getDistance(vertices[0])));
        return a;
    }

}

