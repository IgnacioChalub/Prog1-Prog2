package austral.prog2.PracticaPrimerParcial.Parcial2018.Ejercicio1;

public class Activity implements Nameable{

    String tipo;
    int pointsPerUse;
    int totalPoints;

    public Activity(String tipo, int pointsPerUse) {
        this.tipo = tipo;
        this.pointsPerUse = pointsPerUse;
        this.totalPoints = 0;
    }

    public void work() {
        totalPoints += pointsPerUse;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void share() {
        totalPoints++;
    }

    @Override
    public String getName() {
        return tipo;
    }
}
