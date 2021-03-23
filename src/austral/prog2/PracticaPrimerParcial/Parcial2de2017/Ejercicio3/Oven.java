package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio3;

import java.util.*;

public class Oven<T extends Cocinar> {

    HashMap<T, Time> elements;
    List<T> burnedElements;

    public Oven() {
        this.elements = new HashMap<T, Time>();
    }

    public void add(T element, int hora, int minuto, int segundo){
        elements.put(element, new Time(hora, minuto, segundo));
    }

    public void remove(T element){
        elements.remove(element);
    }

    public List<T> getRemovementSuggestions(Time timeNow){
        List<T> suggestions = new ArrayList<>();
        for ( Map.Entry me: elements.entrySet()) {
            Time time = (Time) me.getValue();
            T element = (T) me.getKey();
            if(isBurned(timeNow,element,time)){
                suggestions.add((T) me.getKey());
            }
        }
        return suggestions;
    }

    public List<T> getRemovementSuggestions2(Time timeNow){
        List<T> suggestions = new ArrayList<>();
        for ( T element : elements.keySet()) {
            Time time = elements.get(element);
            if(isBurned(timeNow,element,time)){
                suggestions.add((T) element);
            }
        }
        return suggestions;
    }

    public boolean isBurned(Time timeNow, T element, Time time){
        return time.compareTime(timeNow, element.getCookingTime());
    }



}
