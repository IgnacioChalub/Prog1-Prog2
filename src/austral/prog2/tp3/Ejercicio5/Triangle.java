package austral.prog2.tp3.Ejercicio5;

public class Triangle extends Figure2D {

    private final Point2D height,base1,base2;

    public Triangle(Point2D height,Point2D base1, Point2D base2) {
        this.height = height;
        this.base1 = base1;
        this.base2= base2;


    }

    @Override
    public boolean isThere(Point2D point) {

        return false;
    }

}
