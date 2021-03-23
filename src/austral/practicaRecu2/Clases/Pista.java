package austral.practicaRecu2.Clases;

import austral.prog2.tp6.Ejercicio1.ArrayList;
import austral.prog2.tp6.Ejercicio1.List;

public class Pista {

    String tipo;
    ArrayList segmentos;

    public Pista(String tipo, ArrayList segmentos) {
        this.tipo = tipo;
        this.segmentos = segmentos;
    }

    public String getTipo(){
        return tipo;
    }

    public ArrayList getSegmentos() {
        return segmentos;
    }
}
