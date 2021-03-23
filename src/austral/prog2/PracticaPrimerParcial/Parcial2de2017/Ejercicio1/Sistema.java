package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1;

import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Cocina.Cocina;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Articulos;

import java.util.List;

public class Sistema {

    List<Pedido> pedidos;

    public void ingresarPedido(List<Articulos> articulos, int horaActual, int minutoActual, int segundosActuales, Cliente cliente){
        Pedido pedido = new Pedido(articulos, horaActual, minutoActual, segundosActuales, cliente);
        pedidos.add(pedido);
        cliente.setPedidoIniciado();
    }

    public List<Articulos> entregarPedido(Pedido pedido){
        if(pedido.isListo()){
           return pedido.getArticulos();
        }
        return null;
    }

    public void enviarPedido(Cocina cocina){
        try{
            //ingresa pedido a la cocina
            cocina.ingresarPedidoACocina(pedidos.get(0));
            //saca el pedido de la lista de pedidos
            pedidos.remove(0);
        }catch(IllegalArgumentException e){
            return;
        }
    }





}
