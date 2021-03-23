package austral.prog2.tp4.Ejercicio4;

public class Gerente extends Empleado{

    Subordinado[] subordinados;
    int subordinadosActuales;

    public Gerente(double sueldoBase, String nombre, int edad, int cantSubordinados) {
        super(sueldoBase, nombre, edad);
        subordinadosActuales = 0;
        subordinados = new Subordinado[cantSubordinados];
    }

    @Override
    public double getSueldo() {
        double sueldoTotal = sueldoBase;
        for(int i = 0; i<subordinados.length; i++){
            if(subordinados[i] != null){
                sueldoTotal = sueldoTotal + subordinados[i].getSueldo() * 0.01;
            }
        }
        return sueldoTotal;
    }

    public void agregarEmpleado(Subordinado s){
        if(subordinados.length == subordinadosActuales){
            return;
        }
        subordinados[subordinadosActuales] = s;
        subordinadosActuales++;
    }

    public static void main(String[] args) {
        Subordinado s1 = new Subordinado(100, "Juan", 20);
        Subordinado s2 = new Subordinado(200, "Ignacio", 20);
        Gerente g = new Gerente(500,"Jorge", 40, 1);

        g.agregarEmpleado(s1);
        g.agregarEmpleado(s2);

        System.out.println(g.getSueldo());
        System.out.println(s1.getSueldo());
        System.out.println(s2.getSueldo());
    }

}
