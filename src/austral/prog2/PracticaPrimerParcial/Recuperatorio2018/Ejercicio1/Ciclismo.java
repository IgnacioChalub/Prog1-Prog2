package austral.prog2.PracticaPrimerParcial.Recuperatorio2018.Ejercicio1;

import java.util.HashMap;

public class Ciclismo extends Carrera{

    HashMap<Competidor, Bicicleta> competidores;

    public Ciclismo(int date, int distance, String location){
        this.precio = 400;
        competidores = new HashMap<>();
        this.date = date;
        this.distance = distance;
        this.location = location;
    }

    public void registrarCilcista(Competidor competidor){
        if(competidor.puedeCompetir() && competidor.getBicicleta() != null){
            competidores.put(competidor, competidor.getBicicleta());
        }
    }

}
