package austral.prog1.tp3;

class Tp3IgnacioChalubQuadratic{

    double a;
    double b;
    double c;

    public Tp3IgnacioChalubQuadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double valueY(double x){
        return a * Math.pow(x, 2) + b * x + c;
    }

    double valueX(double y){
        return  (-1 * b + Math.sqrt( Math.pow(b, 2) - 4 * a * (c - y))) / ( 2 * a ) ;

    }

    String roots(){

        double root1 = (( -1 * b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / ( 2 * a ) );
        double root2 = (( -1 * b - Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / ( 2 * a ) );

        if(root1 == root2){
            return "(" + root1 + ")";


        }else if( Math.pow(b, 2) < (4 * a * c)){
            return "Su funcion no tiene raiz";

        }else{
            return  "(" + root1 + "," + root2 + ")";

        }

    }

    String getString(){
        return "Y =" + a + " * X2 + " + b + " * X + " + c;
    }

    String derivation(){

        return 2 * a  + " x  + "  + b ;

    }

    double setA(double newA){
        a = newA;
        return a;
    }

    double setB(double newB){
        a = newB;
        return b;
    }

    double setC(double newC){
        a = newC;
        return c;
    }


}
