package austral.prog2.tp4.Ejercicio5;

public class TarjetaEstudiantes extends Tarjeta{

    double descuento = 0.2; // 80% de descuento
    int viajesHoy = 0;

    @Override
    public void pagarViaje(double precio) {
        if(viajesHoy < 2){
            precio = precio*descuento;
            if(puedePagar(precio)){
                saldo = saldo - precio;
                viajesHoy++;
                return;
            }
        }else{
            if(puedePagar(precio)){
                saldo = saldo - precio;
                viajesHoy++;
                return;
            }
        }
    }

    public void resetearViajesDiarios(){
        viajesHoy = 0;
    }


}
