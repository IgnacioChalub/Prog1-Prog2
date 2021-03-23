package austral.prog2.tp1;

public class BankAccount {
    String CBU;
    float balance;

    public BankAccount(String CBU, int balance){
        this.CBU = CBU;
        this.balance = balance;
    }

    public void deposit(float amount){
        if(amount < 0){
            return;
        }else{
            balance += amount;
        }
    }

    public void withdraw(float amount){
        if(amount < 0 || amount > balance){
            return;
        }else{
            balance -= amount;
        }
    }

    public float getBalance(){
        return balance;
    }

    public String getCBU(){
        return CBU;
    }

    public static void main(String[] args) {
        BankAccount cuenta = new BankAccount("1111", 100);

        cuenta.deposit(-10);
        cuenta.deposit(15);
        cuenta.withdraw(2);
        System.out.println(cuenta.getCBU());
        System.out.println(cuenta.getBalance());
    }
}
