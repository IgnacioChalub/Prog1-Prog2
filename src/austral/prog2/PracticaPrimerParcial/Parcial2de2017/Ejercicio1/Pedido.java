package austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1;

import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Cliente;
import austral.prog2.PracticaPrimerParcial.Parcial2de2017.Ejercicio1.Comidas.Articulos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    List<Articulos> articulosPedidos;
    int horaActual;
    int minutoActual;
    int segundosActuales;
    Cliente cliente;
    boolean listo;
    List<Articulos> articulosListos;


    public Pedido(List<Articulos> articulosPedidos, int horaActual, int minutoActual, int segundosActuales, Cliente cliente) {
        this.articulosPedidos = articulosPedidos;
        this.horaActual = horaActual;
        this.minutoActual = minutoActual;
        this.segundosActuales = segundosActuales;
        this.cliente = cliente;
        boolean listo = false;
        articulosListos = new ArrayList<>();
    }

    public boolean isListo() {
        return listo;
    }

    public List<Articulos> getArticulos(){
        return articulosListos;
    }


    public void setArticulosListos(List<Articulos> articulos) {
        articulosListos.addAll(articulos);
    }
}
