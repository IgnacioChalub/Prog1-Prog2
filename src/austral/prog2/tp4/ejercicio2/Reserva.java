package austral.prog2.tp4.ejercicio2;

public class Reserva {

    int fecha;  // podria hacer una clase fecha
    Cliente[] huespedes;
    Habitacion habitacion;

    public Reserva(int fecha, int cantHuespedes, Habitacion habitacion){
        this.fecha = fecha;
        this.habitacion = habitacion;
        habitacion.setReserva();
        huespedes = new Cliente[cantHuespedes];
    }

    public void hospedar(int fechaHoy){
        if(huespedes.length > habitacion.getCapacidadMax() || fecha != fechaHoy){
            return;
        }
        for(int i = 0; i < huespedes.length; i++){
            habitacion.ingresarPersonas(huespedes[i]);
        }
    }







}
