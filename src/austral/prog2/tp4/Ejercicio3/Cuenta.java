package austral.prog2.tp4.Ejercicio3;

public abstract class Cuenta {

    int balance;
    String cbu;

    public Cuenta(int balance, String cbu){
        this.balance = balance;
        this.cbu = cbu;
    }

    public Cuenta(String cbu){
        balance = 0;
        this.cbu = cbu;
    }

    public int getBalance(){
        return balance;
    }

    public abstract void retirar(int amount); // puede variar dependiendo la cuent, puede ser que te den credito por ejemplo,
                                              // o que sumes puntos

    public void deposit(int amount) {
        balance += amount;
    }
}
