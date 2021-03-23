package austral.prog2.tp4.ejercicio1;

public class PersonalAdministrativo extends Empleado{

    public PersonalAdministrativo(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public Curso crearCurso(String tematica, Profesor profesor, Alumno[] alumnos){
        Curso curso = new Curso(tematica, profesor, alumnos);
        return curso;
    }

    public Seminario crearSeminario(String tematica, Profesor profesor, Persona[] asisten){
        Seminario seminario = new Seminario(tematica, profesor, asisten);
        return seminario;
    }

}
