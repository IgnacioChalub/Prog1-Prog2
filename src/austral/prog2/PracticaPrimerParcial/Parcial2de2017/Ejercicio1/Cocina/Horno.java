package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Cocina;

import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Fritos;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Hamburgesa;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Medallon;

import java.util.ArrayList;
import java.util.List;

public class Horno {

    List<Hamburgesa> horneando;

    public Horno() {
        this.horneando = new ArrayList<>();
    }

    public void meterAlHorno(List<Hamburgesa> hamburgesa){
        horneando.addAll(hamburgesa);
    }



}
