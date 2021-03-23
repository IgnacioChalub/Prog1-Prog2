package austral.prog2.PracticaPrimerParcial.Parcial2018.Ejercicio1;

public class CompletedActivityNotification extends Notification{

    String habitName;

    public CompletedActivityNotification(User sender, User reciver, String habitName){
        super(sender, reciver);
        this.habitName = habitName;
    }

    public String getHabitName() {
        return habitName;
    }
}
