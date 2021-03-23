package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas;


import java.util.List;

public class Hamburgesa extends Articulos{

    List<Medallon> medallones;
    Pan pan;

    public Hamburgesa(List<Medallon> medallones, Pan pan) {
        this.medallones = medallones;
        this.pan = pan;
    }
}
