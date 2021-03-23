package austral.prog2.tp4.Ejercicio5;

public class TarjetaJubilados extends Tarjeta{

    double descuento = 0.8; //20% de descuento

    @Override
    public void pagarViaje(double precio) {
        precio = precio*descuento;
        if(puedePagar(precio)){
            saldo = saldo - precio;
        }
    }

}
