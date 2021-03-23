package austral.prog2.tp4.Ejercicio5;

public abstract class Tarjeta {

    double saldo = 0;
    double descubierto = -10;

    public void cargarTarjeta(double amount){
        saldo += amount;
    }

    public boolean puedePagar(double precio){
        if(precio <= (saldo - descubierto)){
            return true;
        }else{
            System.out.println("No tiene suficiente saldo");
            return false;
        }
    }

    public abstract void pagarViaje(double precio);

    public void cambiarDescubierto(double nuevoDescubierto){
        descubierto = nuevoDescubierto;
    }

    public double getSaldo(){
        return saldo;
    }


}
