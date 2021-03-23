package austral.prog2.PracticaPrimerParcial.Recuperatorio2018.Ejercicio1;

public class Informe {

    int ranking;
    String tipo;
    int tiempo;
    double velocidad;

    public Informe(int ranking, String tipo, int tiempo, int distance) {
        this.ranking = ranking;
        this.tipo = tipo;
        this.tiempo = tiempo;
        this.velocidad = distance/tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public int getRanking(){
        return ranking;
    }
}
