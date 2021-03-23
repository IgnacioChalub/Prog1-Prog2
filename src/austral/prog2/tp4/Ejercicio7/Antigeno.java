package austral.prog2.tp4.Ejercicio7;

public class Antigeno {

    boolean active;

    String tipo;

    public Antigeno(String tipo){
        this.tipo = tipo;
        active = true;
    }

    public String getTipo(){
        return tipo;
    }

    public void desactivate(){
        active = false;
    }

}
