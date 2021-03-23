package austral.prog2.tp6.Ejercicio3.Guia2;


// la agregacion de la clase banco con sus compionetes es fuerte porque no existe un banco sin sus cuentas

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<BankAccount> cuentas;

    public Bank(List<BankAccount> cuentas){
        this.cuentas = cuentas;
    }

    public BankAccount searchByCBU(String CBU){
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getCBU() == CBU){
                return cuentas.get(i);
            }
        }
        return null;
    }

    public void transferMoney(int amount, String CBU1, String CBU2){
        BankAccount a = searchByCBU(CBU1);
        BankAccount b = searchByCBU(CBU2);
        if(a == null || b == null){
            System.out.println("No existe alguna de las cuentas");
            return;
        }
        if(amount > a.getBalance()){
            System.out.println("No tiene suficiente dinero.");
            return;
        }
        a.extraer(amount);
        b.deposit(amount);
    }

    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("111", 100);
        BankAccount c2 = new BankAccount("222", 200);

        List<BankAccount> cuentas = new ArrayList<>();

        cuentas.add(c1);
        cuentas.add(c2);

        Bank banco = new Bank(cuentas);

        banco.transferMoney(50, "111","222");
        banco.transferMoney(100, "222","111");

        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());
    }


}
