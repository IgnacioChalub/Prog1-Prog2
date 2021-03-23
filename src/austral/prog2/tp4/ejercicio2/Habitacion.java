package austral.prog2.tp4.ejercicio2;

public abstract class Habitacion {

    boolean ocupada;
    boolean reservada;
    int precio;
    int capacidadMax;
    int cantPersonas;
    Cliente[] clientes;

    public Habitacion(int precio, int capacidadMax, int cantPersonas){
        ocupada = false;
        reservada = false;
        this.capacidadMax = capacidadMax;
        this.cantPersonas = cantPersonas;
        this.precio = precio;
        clientes = new Cliente[capacidadMax];
    }

    public void ingresarPersonas(Cliente huesped){
        if(cantPersonas > capacidadMax || cantPersonas == capacidadMax){
            return;
        }else{
            cantPersonas++;
            clientes[cantPersonas] = huesped;
        }
    }

    public void setOcupada(){
        ocupada = true;
    }

    public void setReserva(){
        reservada = true;
    }

        public int getCapacidadMax(){
        return capacidadMax;
        }

}
