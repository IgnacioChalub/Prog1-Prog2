package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

public class FinishedInformation {

    Competidor competidor;
    int tiempo;

    public FinishedInformation(Competidor competidor, int tiempo) {
        this.competidor = competidor;
        this.tiempo = tiempo;
    }

    public Competidor getCompetidor(){
        return competidor;
    }

    public int getTiempo() {
        return tiempo;
    }
}
