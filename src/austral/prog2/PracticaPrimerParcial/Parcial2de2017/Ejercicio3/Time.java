package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio3;

public class Time {

    int hora;
    int minuto;
    int segundo;

    public Time(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public double toMin(){
        double min = hora*60 + minuto + segundo/60;
        return min;
    }

    //devuelve true si hay diferencia de tiempo mayor a esos mins
    public boolean compareTime(Time aTime, int min){
        return this.toMin() >= aTime.toMin();
    }
}
