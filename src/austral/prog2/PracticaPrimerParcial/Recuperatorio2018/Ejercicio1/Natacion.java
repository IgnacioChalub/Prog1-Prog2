package austral.prog2.PracticaPrimerParcial.Recuperatorio2018.Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Natacion extends Carrera{

    List<Competidor> competidores;

    public Natacion(int date, int distance, String location){
        this.precio = 1000;
        competidores = new ArrayList<>();
        this.date = date;
        this.distance = distance;
        this.location = location;
    }

    public void registrarNadador(Competidor competidor){
        if(competidor.puedeCompetir() && competidor.sabeNadar()){
            competidores.add(competidor);
        }
    }

}
