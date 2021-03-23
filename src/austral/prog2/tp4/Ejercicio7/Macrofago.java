package austral.prog2.tp4.Ejercicio7;

public class Macrofago extends Celula {

    public void destruirAntigeno(Antigeno a){
        a.desactivate();
    }

    public Antigeno crearAntigenoProteico(){
        Antigeno a = new Antigeno("proteico");
        return a;
    }

}
