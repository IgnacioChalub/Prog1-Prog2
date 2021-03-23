package austral.prog2.tp4.Ejercicio7;

public class LinfocitosTCD4 extends Celula {

    public void fomentarAnticuerpos(LinfocitosB l){
        l.producirAnticuerpos();
    }

    public void llamarCD8(LinfocitosTCD8 l, Antigeno a){
        l.destruirAntigeno(a);
    }

    public void llamarMacrofago(Macrofago m, Antigeno a){
        m.destruirAntigeno(a);
    }

    public boolean detectAntigenoProteico(Antigeno a){
        if(a.getTipo().equals("proteico")){
            return true;
        }else{
            return false;
        }

    }

}
