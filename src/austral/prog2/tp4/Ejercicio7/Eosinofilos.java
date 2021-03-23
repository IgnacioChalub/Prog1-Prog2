package austral.prog2.tp4.Ejercicio7;

public class Eosinofilos extends Celula{

    public void destruirParasito(Antigeno p){
        if(p.getTipo().equals("parasito")) {
            p.desactivate();
        }
    }

}


