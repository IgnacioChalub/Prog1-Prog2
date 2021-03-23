package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Maraton extends Carrera {

   List<Competidor> competidores;

    public Maraton(int date, String location, int distance) {
        this.competidores = new ArrayList<>();
        this.precio = 500;
        this.location = location;
        this.distance = distance;
        this.finalizados = new ArrayList<>();
    }

    public void registerCompetidor(Competidor competidor) throws IOException {
        if(competidor.requisitosMinimos() && !competidores.contains(competidor)){
            competidores.add(competidor);
        }else{
            throw new IOException("No se pudo anotar al competidor.");
        }
    }


}
