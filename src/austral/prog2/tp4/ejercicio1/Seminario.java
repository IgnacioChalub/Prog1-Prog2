package austral.prog2.tp4.ejercicio1;

public class Seminario extends Clases {

    //pueden asistir tanto alumnos como profesores y es dictado por un profesor

    public Seminario(String tematica, Profesor profesor, Persona[] asisten) {
        super(tematica, profesor, asisten);
    }
}
