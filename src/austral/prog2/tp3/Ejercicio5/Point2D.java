package austral.prog2.tp3.Ejercicio5;

public class Point2D {

    double x;
    double y;
    public Point2D(double x, double y){
        this.x= x;
        this.y= y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    /*
    0 si es igual
    >0 si el primero > segundo
    <0 si el primero< segundo
     */
    public double compareToX(Point2D otherpoint){
        return x- otherpoint.getX();
    }
    public double compareToY(Point2D otherpoint){
        return y- otherpoint.getY();
    }

}
