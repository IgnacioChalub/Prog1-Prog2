package austral.prog2.tp2;

public class Rectas {

    Punto punto1;
    Punto punto2;

    public Rectas(Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public float getLength(){
        return punto1.getDistance(punto2);
    }



}
