package austral.prog2.PracticaPrimerParcial.Parcial2018.Ejercicio1;

public class ShareActivityNotification extends Notification{

    String habitName;
    String activityType;

    public ShareActivityNotification(User sender, User reciver, String habitName, String activityType) {
        super(sender,reciver);
        this.habitName = habitName;
        this.activityType = activityType;
    }

    public User getReciver() {
        return reciver;
    }

    public String getHabitName() {
        return habitName;
    }


}
