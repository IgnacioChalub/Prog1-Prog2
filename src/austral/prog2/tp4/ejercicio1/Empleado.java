package austral.prog2.tp4.ejercicio1;

public abstract class Empleado extends Persona{

    double sueldo;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
}
