package austral.prog2.tp3.Ejercicio8910;

public class SavingAccount extends Account{

    int operaciones;

    public SavingAccount(String id){
        super(id, 0);
        operaciones = 0;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public Check issueCheck(int amount){
        if(operaciones >= 3 || amount > balance){
            System.out.println("Error, no pudo hacer el cheque");
            return new Check(0);
        }else{
            operaciones = operaciones + 1;
            balance -= amount;
            return new Check(amount);

        }

    }

}
