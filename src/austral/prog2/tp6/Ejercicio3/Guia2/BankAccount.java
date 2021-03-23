package austral.prog2.tp6.Ejercicio3.Guia2;

public class BankAccount {

    String CBU;
    int balance;

    public BankAccount(String CBU, int balance){
        this.CBU = CBU;
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount < 0){
            return;
        }
        balance += amount;
    }

    public void extraer(int amount){
        if(amount > balance || amount < 0){
            return;
        }
        balance -= amount;
    }

    public String getCBU(){
        return CBU;
    }

}
