package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio3;


import java.util.List;

public class Sumar extends Magic<Integer, Integer>{

    @Override
    public Integer spell(List<Integer> elements) {
        Integer count = 0;
        for (int i = 0; i < elements.size(); i++) {
            count += elements.get(i);
        }
        return count;
    }

}
