package austral.prog2.tp4.Ejercicio7;

public abstract class Celula {

    boolean active;

    public Celula(){
        active = true;
    }

    public void Respirar(){}

    public void alimentarse(){}

    public boolean isActive(){
        return active;
    }

    public void desactivate(){
        active = false;
    }

}
