package austral.prog2.tp4.ejercicio1;

public abstract class Clases {

    String tematica;
    Profesor profesor;
    Persona[] asisten;

    public Clases(String tematica, Profesor profesor, Persona[] asisten){
        this.tematica = tematica;
        this.profesor = profesor;
        this.asisten = asisten;

    }

}
