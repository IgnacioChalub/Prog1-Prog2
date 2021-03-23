package austral.prog2.tp4.Ejercicio5;

public class TarjetaNormal extends Tarjeta{

    @Override
    public void pagarViaje(double precio) {
      if(puedePagar(precio)){
          saldo = saldo - precio;
      }
    }

    public static void main(String[] args) {
        TarjetaNormal normal = new TarjetaNormal();
        TarjetaEstudiantes estudiante = new TarjetaEstudiantes();
        TarjetaJubilados jubilado = new TarjetaJubilados();

        normal.cargarTarjeta(10);
        estudiante.cargarTarjeta(2);
        jubilado.cargarTarjeta(0);

        estudiante.pagarViaje(5);
        System.out.println(estudiante.getSaldo());
        estudiante.pagarViaje(5);
        System.out.println(estudiante.getSaldo());
        estudiante.pagarViaje(10);
        System.out.println(estudiante.getSaldo());
        estudiante.resetearViajesDiarios();
        estudiante.pagarViaje(10);
        System.out.println(estudiante.getSaldo());

    }

}
