package austral.prog2.tp3.Ejercicio6;

import austral.prog2.tp1.Point2D;

import java.awt.*;

public abstract class Poligono {

    Point2D[] vertices;

    public Poligono(Point2D[] vertices){
        this.vertices = vertices;
    }

    public double perimetro(){
        double a = 0;
        for(int i = 0; i < vertices.length - 1; i++){
            a = a + vertices[i].getDistance(vertices[i+1]);
        }
        return a;
    }

    public abstract double area();

}
