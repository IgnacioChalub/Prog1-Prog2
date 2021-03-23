package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio3;

import java.util.List;

public class SoloVocales extends Magic<String, String> {


    @Override
    public String spell(List<String> elements) {
        Unir unir = new Unir();
        String cadena = unir.spell(elements);
        String vocales = "";
        for (int i = 0; i < cadena.length(); i++) {
            if(isVocal(cadena.charAt(i))){
                vocales += cadena.charAt(i);
            }
        }
        return vocales;
    }

    public boolean isVocal(char caracter){
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter== 'u'){
            return true;
        }
        return false;
    }
}
