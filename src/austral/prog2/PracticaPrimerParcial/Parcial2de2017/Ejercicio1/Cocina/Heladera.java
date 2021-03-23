package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Cocina;

import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Articulos;

import java.util.List;

public class Heladera {

    List<Articulos> articulos;

    public Heladera(List<Articulos> articulos) {
        this.articulos = articulos;
    }

    public List<Articulos> getArticulos(){
        return articulos;
    }

}
