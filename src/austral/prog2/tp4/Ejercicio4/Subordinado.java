package austral.prog2.tp4.Ejercicio4;

public class Subordinado extends Empleado {

    public Subordinado(double sueldoBase, String nombre, int edad) {
        super(sueldoBase, nombre, edad);
    }

    @Override
    public double getSueldo() {
        return sueldoBase;
    }
}
