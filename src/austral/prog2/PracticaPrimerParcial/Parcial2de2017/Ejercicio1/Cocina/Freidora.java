package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Cocina;

import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Fritos;

import java.util.ArrayList;
import java.util.List;

public class Freidora {

    List<Fritos> friendo;

    public Freidora() {
        this.friendo = new ArrayList<>();
    }

    public void freir(List<Fritos> aFreir){
        friendo.addAll(aFreir);
    }
}
