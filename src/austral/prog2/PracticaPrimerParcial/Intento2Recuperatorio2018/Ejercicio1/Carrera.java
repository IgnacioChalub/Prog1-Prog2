package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

import java.util.List;

public abstract class Carrera {

    List<FinishedInformation> finalizados;

    int precio;
    int date;
    String location;
    int distance;

    public void endRace(Competidor competidor, int finishDate){
        FinishedInformation finishedInformation = new FinishedInformation(competidor, finishDate-date);
        finalizados.add(finishedInformation);
        Informe informe = new Informe(this.getClass().getSimpleName(), finalizados.indexOf(competidor)+1, finishDate - date, distance/(finishDate - date));
        competidor.addInforme(informe);
    }

    public void sortByDNI(){
        for (int i = 0; i < finalizados.size() - 1; i++) {
            for (int j = i+1; j < finalizados.size(); j++) {
                FinishedInformation c1 = finalizados.get(j-1);
                FinishedInformation c2 = finalizados.get(j);
                if(finalizados.get(j-1).getCompetidor().getDNI() > finalizados.get(j).getCompetidor().getDNI()){
                    finalizados.add(j-1, c2);
                    finalizados.remove(j+1);
                }
            }
        }
    }

    public void sortByTime(){
        for (int i = 0; i < finalizados.size() - 1; i++) {
            for (int j = i+1; j < finalizados.size(); j++) {
                FinishedInformation c1 = finalizados.get(j-1);
                FinishedInformation c2 = finalizados.get(j);
                if(finalizados.get(j-1).getTiempo() > finalizados.get(j).getTiempo()) {
                    finalizados.add(j - 1, c2);
                    finalizados.remove(j + 1);
                }
            }
        }
    }


}
