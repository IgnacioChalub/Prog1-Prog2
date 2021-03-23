package austral.prog2.tp4.Ejercicio4;

public abstract class Empleado {

    double sueldoBase;
    String nombre;
    int edad;

    public Empleado(double sueldoBase, String nombre, int edad) {
        this.sueldoBase = sueldoBase;
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract double getSueldo();
}
