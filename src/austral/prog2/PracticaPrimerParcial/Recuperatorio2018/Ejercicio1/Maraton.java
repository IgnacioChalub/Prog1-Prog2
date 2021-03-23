package austral.prog2.PracticaPrimerParcial.Recuperatorio2018.Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maraton extends Carrera{

    List<Competidor> competidores;
    List<Competidor> terminados;

    public Maraton(int date, int distance, String location){
        this.precio = 500;
        competidores = new ArrayList<>();
        this.date = date;
        this.distance = distance;
        this.location = location;
    }

    public void registrarMaratonista(Competidor competidor){
        if(competidor.puedeCompetir()){
            competidores.add(competidor);
        }
    }


}
