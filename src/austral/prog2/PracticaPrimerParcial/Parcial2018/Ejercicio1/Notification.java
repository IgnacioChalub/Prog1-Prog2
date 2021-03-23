package austral.prog2.PracticaPrimerParcial.Parcial2018.Ejercicio1;

public abstract class Notification {

    User sender;
    User reciver;

    public Notification(User sender, User reciver) {
        this.sender = sender;
        this.reciver = reciver;
    }

    public User getReciver() {
        return reciver;
    }

}
