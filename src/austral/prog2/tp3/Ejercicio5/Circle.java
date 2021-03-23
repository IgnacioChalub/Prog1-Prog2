package austral.prog2.tp3.Ejercicio5;

public class Circle extends Figure2D {

    private final Point2D centre;
    private final double radio;

    public Circle(Point2D centre, double radio) {
        this.centre = centre;
        this.radio = radio;
    }

    @Override
    public boolean isThere(Point2D point) {
        /*
        Si la distancia con el centro es menor al radio, va a estar contenido,
        sino
         */
        return PointComparator.getDistance(centre, point) <=  radio;
    }

}
