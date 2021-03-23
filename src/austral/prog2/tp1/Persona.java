package austral.prog2.tp1;

public class Persona {

        static int cantidadPersonas = 0;

        String nombre;
        String apellido;
        String DNI;
        String fecha;
        int horaDeIngreso;
        boolean empleada;

    public Persona(String nombre, String apellido, String DNI, String fecha, int horaDeIngreso, boolean empleada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fecha = fecha;
        this.horaDeIngreso = horaDeIngreso;
        this.empleada = empleada;
        cantidadPersonas++;
    }

    public String toString(){
        return "Nombre: " + nombre + ". Apellido: " + apellido + ".";
    }

    public static int cantidadPersonasRegistradas(){
        return cantidadPersonas;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ignacio" , "Chalub", "43627494", "10/8", 16, true);
        Persona persona2 = new Persona("Juan" , "Chalub", "43627494", "10/8", 16, true);
        Persona persona3 = new Persona("Marcelo" , "Chalub", "43627494", "10/8", 16, false);

        System.out.println(cantidadPersonasRegistradas());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }





}
