package austral.prog2.tp4.Ejercicio3;

public class Banco {

    public void transferir(Cuenta c1, Cuenta c2, int amount){
        if(amount <= c1.getBalance()){
            c1.retirar(amount);
            c2.deposit(amount);
        }
    }

    public void retirarDinero(Cuenta c1, int amount){
        c1.retirar(amount);
    }

}
