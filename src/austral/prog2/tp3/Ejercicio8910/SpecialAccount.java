package austral.prog2.tp3.Ejercicio8910;

public class SpecialAccount extends CheckingAccount{

    int puntos;

    public SpecialAccount(String id, int amount){
        super(id, amount);
    }

    public Check issueCheck(int amount){
        if(amount > balance){
            deuda = deuda + (amount - balance);
            balance = 0;
        }else{
            balance -= amount;
        }
        puntos = puntos + 5;
        return new Check(amount);
    }

    public void depositCheck(Check c){
        c.usar();
        balance += c.getValue();
        puntos = puntos +5;
    }

    public void getPuntos(){
        System.out.println(puntos);
    }



}
