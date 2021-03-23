package austral.prog2.tp1;

public class Point2D {

    double x;
    double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point2D point){
        return Math.sqrt( (point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y) );
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getDistanceToOrigin(){
        return Math.sqrt( (getX() - 0) * (getX() - 0) + (getY() - 0) * (getY() - 0) );
    }

    public static double maxDistanceToOrigin(Point2D[] points){
       Point2D maxPoint = null;
       for(int i = 0; i < points.length; i++){
           if(maxPoint != null && points[i].getDistanceToOrigin() > maxPoint.getDistanceToOrigin()){
               maxPoint = points[i];
           }else if(maxPoint == null){
               maxPoint = points[i];
           }
       }
       return maxPoint.getDistanceToOrigin();
    }

    public static void main(String[] args) {

        Point2D punto1 = new Point2D(1, 1);
        Point2D punto2 = new Point2D(-1, 1);
        Point2D punto3 = new Point2D(3, 4);
        
        Point2D[] puntos = {punto1,punto2,punto3};

        System.out.println(maxDistanceToOrigin(puntos));
    }
}
