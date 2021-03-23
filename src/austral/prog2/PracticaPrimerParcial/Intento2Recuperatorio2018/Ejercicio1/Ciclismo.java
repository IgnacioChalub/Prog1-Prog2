package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

import java.io.IOException;
import java.util.HashMap;

public class Ciclismo extends Carrera{

    HashMap<Competidor,Bicicleta> competidores;

    public Ciclismo(int date, String location, int distance) {
        this.competidores = new HashMap<>();
        this.precio = 400;
        this.location = location;
        this.distance = distance;
    }

    public void registerCompetidor(Competidor competidor) throws IOException {
        if(competidor.requisitosMinimos() && competidor.getBicicleta() != null && !competidores.containsKey(competidor)){
            competidores.put(competidor,competidor.getBicicleta());
        }else{
            throw new IOException("No se pudo registrar al competidor.");
        }
    }

}
