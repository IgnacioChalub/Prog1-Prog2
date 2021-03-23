package austral.prog2.tp3.Ejercicio8910;

public abstract class Account {

    String id;
    int balance;

    public Account(String id, int balance){
        this.id = id;
        this.balance = balance;
    }

    public abstract Check issueCheck(int amount);

    public void deposit(int amount){
        balance = amount + balance;
    }

    public void depositCheck(Check c){
        c.usar();
        balance += c.getValue();
    }

    public int getBalance(){
        return balance;
    }

}
