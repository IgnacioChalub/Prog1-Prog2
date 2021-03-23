package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Cocina;

import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Articulos;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Fritos;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Hamburgesa;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Medallon;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Cocina {

    Freidora freidora;
    Horno horno;
    Heladera heladera;
    Pedido pedidoEnProceso;

    public Cocina(Freidora freidora, Horno horno, Heladera heladera) {
        this.freidora = freidora;
        this.horno = horno;
        this.heladera = heladera;
        this.pedidoEnProceso = null;
    }

    public void ingresarPedidoACocina(Pedido pedido){
        //chequear que tiene para cocinar
        for (int i = 0; i < heladera.getArticulos().size(); i++) {
            if(!heladera.getArticulos().contains(pedido.getArticulos().get(i))){
                throw new IllegalArgumentException("Faltan ingredientes");
            }
        }
        //carga pedido en proceso
        this.pedidoEnProceso = pedido;
        //saca de la heladera lo que se pidio, las hamburguesas se guardan el pan y carne en conjunto
        heladera.getArticulos().removeAll(pedidoEnProceso.getArticulos());
    }

    public void cocinarFritos(){
        //separa los articulos del pedido
        List<Fritos> aFreir = new ArrayList<>();
        List<Hamburgesa> aHorno = new ArrayList<>();
        List<Articulos> resto = new ArrayList<>();
        for (int i = 0; i < pedidoEnProceso.getArticulos().size(); i++) {
            if(pedidoEnProceso.getArticulos().get(i) instanceof Fritos){
                aFreir.add((Fritos) pedidoEnProceso.getArticulos().get(i));
            }else if(pedidoEnProceso.getArticulos().get(i) instanceof Hamburgesa){
                aHorno.add((Hamburgesa) pedidoEnProceso.getArticulos().get(i));
            }else{
                resto.add(pedidoEnProceso.getArticulos().get(i));
            }
        }
        freidora.freir(aFreir);
        horno.meterAlHorno(aHorno);
        pedidoEnProceso.setArticulosListos(resto);
    }

    public void sacarFritos(){

    }

}
