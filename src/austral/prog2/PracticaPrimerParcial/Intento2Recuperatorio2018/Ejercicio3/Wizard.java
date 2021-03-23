package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio3;


import java.util.ArrayList;
import java.util.List;

public class Wizard<T, E> {

    List<T> elements;

    public Wizard(){
        elements = new ArrayList<T>();
    }

    public void add(T element){
        elements.add(element);
    }

    public E magic(Magic<T, E> magic){
      return magic.spell(elements);
    }

    public static void main(String[] args) {
        Wizard<String, String> wizard = new Wizard<>();
        wizard.add("pepe");
        wizard.add("juan");
        wizard.add("lucas");
        Unir unir = new Unir();
        SoloVocales soloVocales = new SoloVocales();
        String resultadoUnir = (String) wizard.magic(unir);
        String resultadoSoloVocales = (String) wizard.magic(soloVocales);
        System.out.println(resultadoUnir);
        System.out.println(resultadoSoloVocales);

        Wizard<Integer, Integer> wizard2 = new Wizard<>();
        wizard2.add(23);
        wizard2.add(7);
        wizard2.add(-5);
        Sumar sumar = new Sumar();
        Integer resultadoSumar = (Integer) wizard2.magic(sumar);
        System.out.println(resultadoSumar);



    }

}
