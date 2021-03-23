package austral.prog2.tp2;

import austral.prog2.tp1.Point2D;

public class Punto {

    int x;
    int y;

     public Punto(int x, int y){
        this.x = x;
        this.y = y;
     }

     public int getX(){
         return x;
     }

     public int getY(){
         return y;
     }

    public float getDistance(Punto point){
        return (float) Math.sqrt( (point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y) );
    }

}
