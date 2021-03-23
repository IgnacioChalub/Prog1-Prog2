package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio3;

import java.util.List;

public class Unir extends Magic<String, String>{

    @Override
    public String spell(List<String> elements){
        String cadena = "";
        for (int i = 0; i < elements.size(); i++) {
            cadena += elements.get(i);
        }
        return cadena;
    }

}
