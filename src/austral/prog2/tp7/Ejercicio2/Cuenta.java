package austral.prog2.tp7.Ejercicio2;

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

    public abstract void retirar(int amount) throws IllegalArgumentException; // puede variar dependiendo la cuent, puede ser que te den credito por ejemplo,
    // o que sumes puntos

    public void deposit(int amount) {
        if(amount > getBalance() || amount < 0){
            throw new IllegalArgumentException("La cantidad de dinero en la cuenta 1 debe ser mayor a la que desea transferir y a cero.");
        }
        balance += amount;
    }
}
