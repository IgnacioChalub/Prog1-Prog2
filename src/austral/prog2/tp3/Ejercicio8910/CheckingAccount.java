package austral.prog2.tp3.Ejercicio8910;

public class CheckingAccount extends Account {

    int deuda;

    public CheckingAccount(String id, int balance){
        super(id, balance);
        deuda = 0;
    }

    public CheckingAccount(String id){
        super(id, 0);
        deuda = 0;
    }

    public Check issueCheck(int amount){
        if(amount > balance){
            deuda = deuda + (amount - balance);
            balance = 0;
        }else{
            balance -= amount;
        }
        return new Check(amount);
    }


    public int getDeuda(){
        return deuda;
    }





}
