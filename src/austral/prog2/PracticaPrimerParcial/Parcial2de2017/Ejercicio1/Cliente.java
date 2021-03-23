package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1;

public class Cliente {

    boolean pedidoIniciado;
    boolean pedidoEntregado;

    public Cliente() {
        this.pedidoIniciado = false;
        this.pedidoEntregado = false;
    }

    public void setPedidoIniciado(){
        this.pedidoIniciado = true;
    }

    public void setPedidoEntregado(){
        this.pedidoEntregado = true;
    }
}
