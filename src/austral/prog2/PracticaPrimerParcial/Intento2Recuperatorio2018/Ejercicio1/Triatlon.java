package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Triatlon extends Carrera{

    List<Competidor> competidores;
    int maratonDistance;
    int ciclismoDistance;
    int natacionDistance;

    public Triatlon(int date, String location, int maratonDistance, int ciclismoDistance, int natacionDistance) {
        this.competidores = new ArrayList<>();
        this.precio = 2000;
        this.location = location;
        this.maratonDistance = maratonDistance;
        this.ciclismoDistance = ciclismoDistance;
        this.natacionDistance = natacionDistance;
        this.distance = maratonDistance + ciclismoDistance + natacionDistance;
        this.finalizados = new ArrayList<>();
    }

    public void registerCompetidor(Competidor competidor) throws IOException {
        if(competidor.requisitosMinimos() && competidor.getBicicleta() != null && competidor.sabeNadar() && !competidores.contains(competidor)){
            competidores.add(competidor);
        }else{
            throw new IOException("No se pudo registrar al competidor");
        }
    }


}
