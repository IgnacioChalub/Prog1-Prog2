package austral.prog2.tp3.Ejercicio5;

public class Rectangle extends Figure2D{
    private Point2D vertex1, vertex2;
    /*

     */
    public Rectangle(Point2D vertex1, Point2D vertex2){
        this.vertex1= vertex1;
        this.vertex2= vertex2;
    }
    @Override
    public boolean isThere(Point2D point) {
        return PointComparator.isContainedX(point,vertex1,vertex2) && PointComparator.isContainedY(point,vertex1,vertex2);
    }

    /*
    private double getMaxY() {
        if(vertex1.getY() >= vertex2.getY()){
            return vertex1.getY();
        }
        return vertex2.getY();
    }
    private double getMinY() {
        if(vertex1.getY() >=  vertex2.getY()){
            return vertex2.getY();
        }
        return vertex1.getY();

    }
    private double getMaxX() {
        if(vertex1.getX() >= vertex2.getX()){
            return vertex1.getX();
        }
        return vertex2.getX();
    }

    private double getMinX() {
        if(vertex1.getX() >= vertex2.getX()){
            return vertex2.getX();
        }
        return vertex1.getX();
    }





    @Override
    public boolean isThere(Point2D point) {
        return point.getX() >= getMinX() && point.getX() <= getMaxX() && point.getY() >= getMinY() && point.getY() <= getMaxY();
    }

     */

}
