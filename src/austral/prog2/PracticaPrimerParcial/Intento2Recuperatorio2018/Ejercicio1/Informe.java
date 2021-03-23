package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

public class Informe {

    String tipo;
    int ranking;
    int tiempo;
    double velocity;

    public Informe(String tipo, int ranking, int tiempo, double velocity) {
        this.tipo = tipo;
        this.ranking = ranking;
        this.tiempo = tiempo;
        this.velocity = velocity;
    }

    public String getTipo(){
        return tipo;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public double getVelocity(){
        return velocity;
    }
}
