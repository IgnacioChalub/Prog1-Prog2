package austral.prog2.tp2;

import java.util.ArrayList;

public class PhoneBill{

    double saldo;
    int[] llamadas;
    double pricePerSecond;

    public PhoneBill(double saldo, double pricePerSecond){
        this.saldo = saldo;
        this. pricePerSecond = pricePerSecond;
        llamadas = new int[3];
    }

    public void cargarSaldo(double amount){
        saldo += saldo;
    }

    public void printSaldo(){
        System.out.println(saldo);
    }

    public void cambiarPrecio(double precio){
        pricePerSecond = precio;
    }

    public void newCall(int duration){
        if(saldo < (duration * 60 * pricePerSecond)){
            System.out.println("No tiene suficiente saldo.");
            return;
        }
        if(llamadas[llamadas.length - 1] != 0){
            int[] llamadasAux = new int[llamadas.length * 2];
            for(int i = 0; i < llamadas.length; i++){
                llamadasAux[i] = llamadas[i];
            }
            llamadas = llamadasAux;
        }
        for(int i = 0; i< llamadas.length; i++){
            if(llamadas[i] == 0){
                saldo = saldo - (duration * 60 * pricePerSecond);
                llamadas[i] = duration;
                return;
            }
        }
    }

    public void printMovimientos(){
        for(int i = 0; i<llamadas.length; i++){
            if(llamadas[i] != 0){
                System.out.println(llamadas[i]);
            }
        }
    }

    public static void main(String[] args) {
        PhoneBill celular = new PhoneBill(300, 1);
        celular.newCall(1);
        celular.printSaldo();
        celular.newCall(3);
        celular.printSaldo();
        celular.newCall(1);
        celular.printSaldo();
        celular.newCall(1);
        celular.printMovimientos();


    }

}
