package austral.prog2.tp0;

public class guia0 {

    public static void main(String[] args) {
        System.out.println(esVocal('f'));
    }

    public static void comparadorPiezas(int[] secuencia){ // 1. devuelve piezas listas, a reparar, rechazadas
       int listas = 0;
       int reparar = 0;
       int rechazadas = 0;

       for(int i = 0; i<secuencia.length; i++){
           if(secuencia[i] == 1){
               reparar++;
           }else if(secuencia[i] == -1){
               rechazadas++;
           }else if(secuencia[i] == 0){
               listas++;
           }else{

           }
       }
        System.out.println(listas + " " +  reparar + " " + rechazadas);
    }

    public static int sumaSecuencia(int[] secuencia){ // 2.
        int suma = 0;
        for(int i = 0; i<secuencia.length; i++){
            suma += secuencia[i];
         }
        return suma;
    }

    public static double areaFigura(String figura, double a){
        return 3.14*a*a;
    }

    public static double areaFigura(String figura, double a, double b){
        return a*b;
    }

    public static double areaFigura(String figura, double a, double b, double c){ //formula sacada de yt
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static boolean esVocal(char aChar){
        switch (aChar){
            case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
                return true;
            default:
                return false;


        }
    }











}
