package austral.prog2.tp3.Ejercicio5;

public class PointComparator {

    public static double compareToX(Point2D point, Point2D otherpoint){
        return point.getX() - otherpoint.getX();
    }

    public static double compareToY(Point2D point, Point2D otherpoint){
        return point.getY() - otherpoint.getY();
    }

    /*
    Si son simbolos opuestos significa que estan contenidos:
    Si es mayor a uno y menor al otro.... + - ))) Esta contenido
    Si son simbolos iguales significa que no esta contenido:
    Si es mayor a los dos---- + +
    Si es menor a los dos---- - -
     */

    public static boolean isContainedX(Point2D point, Point2D first, Point2D second){
        return compareToX(point, first) * compareToX(point, second)<= 0;
    }

    public static boolean isContainedY(Point2D point, Point2D first, Point2D second){
        return compareToY(point, first) * compareToY(point, second) <= 0 ;
    }

    public static double getDistance(Point2D point, Point2D otherpoint){
        double cateto1= otherpoint.getX()- point.getX();
        double cateto2= otherpoint.getY() - point.getY();
        double h= Math.sqrt(cateto1*cateto1 + cateto2*cateto2); //Hipotenusa
        return h;
    }

}
