package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Natacion extends Carrera{

    List<Competidor> competidores;

    public Natacion(int date, String location, int distance){
        competidores = new ArrayList<>();
        this.precio = 1000;
        this.location = location;
        this.distance = distance;
    }

    public void registerCompetidor(Competidor competidor) throws IOException {
        if(competidor.requisitosMinimos() && competidor.sabeNadar() && !competidores.contains(competidor)){
            competidores.add(competidor);
        }else{
            throw new IOException("No se pudo registrar al competidor");
        }
    }


}
